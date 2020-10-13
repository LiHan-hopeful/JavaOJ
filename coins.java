import java.util.Scanner;

//5.硬币划分瓜子二手车2019秋招
public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = {1, 2, 5, 10};
        int num = coins.length;
        int[][] methodNum = new int[num + 1][n + 1];
        for (int i = 0; i <= num; ++i)
            //初始化
            methodNum[i][0] = 1;
        for (int i = 1; i <= coins.length; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (j >= coins[i - 1]) {
                    methodNum[i][j] = (methodNum[i - 1][j] + methodNum[i][j - coins[i -
                            1]]) % 1000000007;
                } else
                    methodNum[i][j] = methodNum[i - 1][j];
            }
        }
        System.out.println(methodNum[num][n]);
    }
}

