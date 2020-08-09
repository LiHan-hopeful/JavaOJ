public static int solve(int money, int[][] moneyCount)
   {
        int num = 0;
        //首先选择最大面值的纸币
        for (int i = moneyCount.length - 1; i >= 0; i--)
       {
            //需要的当前面值与面值数量取最小
            int c = Math.min(money / moneyCount[i][0], moneyCount[i][1]);
            money = money - c * moneyCount[i][0];
            num += c;
       }
        if (money > 0)
            num = -1;
        return num;
   }
    public static void main(String[] args) {
        //存放纸币与数量: first:纸币，second:数量
        int[][] moneyCount = { { 1, 3 }, { 2, 1 }, { 5, 4 }, { 10, 3 }, { 20, 0 }
               ,{50, 1}, { 100, 10 } };
        Scanner scanner = new Scanner(System.in);
        int money;
        System.out.println("请输入要支付的钱");
        money = scanner.nextInt();
        int res = solve(money, moneyCount);
        if (res != -1)
            System.out.println(res);
        else
            System.out.println("No");
   }