class myComparator implements Comparator<int[]> {
        //按作业时间从大到小排序
        public int compare(int a, int b) {
            return b - a;
       }
   }
public static int findMax(int[] machines){
        int ret = machines[0];
        for (int cur : machines)
       {
            if (ret < cur)
                ret = cur;
       }
        return ret;
   }
private static int greedStrategy(int[] works, int[] machines) {
        // 按作业时间从大到小排序
        Arrays.sort(works, new myComparator());
        // 作业数如果小于机器数，直接返回最大的作业时间
        if (workNum <= machineNum) {
            minimalTime = works[0];
            return minimalTime;
       } else {
            // 为每一个作业选择机器
            for (int i = 0; i < workNum; i++) {
                // 选择最小的机器
                int flag = 0;
                //首先假设用第一个机器处理
                int tmp = machines[flag];
                // 从剩余机器中选择作业时间最小的
                for (int j = 1; j < machines.length; j++) {
                    if (tmp > machines[j]) {
                        flag = j;
                        tmp = machines[j];
                   }
               }
                // 将当前作业交给最小的机器执行
                machines[flag] += works[i];
           }
            // 从所有机器中选出最后执行完作业的机器
            minimalTime = findMax(machines);
            return minimalTime;
       }
   }
public static void main(String[] args) {
        int n, m;
        System.out.println("请输入作业数和机器数");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] works = new int[n];
        int[] machines = new int[m];
        for (int i = 0; i < n; ++i)
            works[i] = scanner.nextInt();
        System.out.println(greedStrategy(works, machines));
     }