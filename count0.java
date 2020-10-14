import java.util.Scanner;

//7.求表达式 f(n)结果末尾0的个数小红书2019年校园招聘
//输入一个自然数n，求表达式 f(n) = 1! * 2! * 3!.....n! 的结果末尾有几个连续的0？
public class Main {
    public static int calNumber(int num, int n){
        int cnt = 0;
        while (num >= n && num % n == 0){
            ++cnt;
            num /= n;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num2 = 0, num5 = 0;
        for (int i = 1; i <= n; i++){
//整个式子中包含的数字i共有：n + 1 - i个
            num2 += calNumber(i, 2) * (n + 1 - i);
            num5 += calNumber(i, 5) * (n + 1 - i);
        }
        System.out.println(Math.min(num2, num5));
    }

}


