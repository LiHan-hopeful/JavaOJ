import java.util.Scanner;

//1.复数乘法哔哩哔哩2020校园招聘

public class Main {
        public static int stringtoInt(String s){
            int num = 0;
            int flag = 1;
            for (int i = 0; i < s.length(); i++){
                //如果有负号，说明是负数
                if (s.charAt(i) == '-')
                    flag = -1;
                //只利用数字字符，i不使用
                else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    num = num * 10 + (s.charAt(i) - '0');
            }
            return num * flag;
        }
        public static void main(String[] args) {
            String s1, s2;
            Scanner scanner = new Scanner(System.in);
            s1 = scanner.nextLine();
            s2 = scanner.nextLine();
            //截取整数部分
            String s1First = s1.substring(0, s1.indexOf('+'));
            String s2First = s2.substring(0, s2.indexOf('+'));
            //截取复数部分
            //复数1
            String s1Second = s1.substring(s1.indexOf('+') + 1);
            //复数2
            String s2Second = s2.substring(s2.indexOf('+') + 1);
            //把字符串转换成整数
            int s1F = stringtoInt(s1First);
            int s2F = stringtoInt(s2First);
            int s1S = stringtoInt(s1Second);
            int s2S = stringtoInt(s2Second);
            //整数部分
            int F = s1F*s2F - s1S*s2S;
            //复数
            int S = s1F*s2S + s1S*s2F;
            System.out.println(F + "+" + S + "i");
        }
    }