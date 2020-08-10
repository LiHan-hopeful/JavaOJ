class myComparator implements Comparator<int[]> {
    //按起点递增排序
    public int compare(int[] a, int[] b) {
        return a[1] - b[1];
    }
}
    public static int greedyActivitySelector(int[][] act)
    {
        //贪婪策略：每次选择最早结束的活动
        int num = 1, i = 0;
        for (int j = 1; j < act.length; j++)
        {
            if (act[j][0] >= act[i][1])
            {
                i = j;
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] act = new int[number][2];
        int idx = 0;
        for (int i = 0; i < act.length; ++i)
        {
            act[i][0] = scanner.nextInt();
            act[i][1] = scanner.nextInt();
        }
        //按照活动截止时间从小到大排序
        Arrays.sort(act, new myComparator());
        int ret = greedyActivitySelector(act);
        System.out.println(ret);
    } 
