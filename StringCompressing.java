import java.util.Scanner;

//8.字符串压缩算法小红书2019年校园招聘
//输入一串字符，请编写一个字符串压缩程序，将字符串中连续出现的重复字母进行压缩，并输出压缩后的字符串。
//例如： aac 压缩为 1ac xxxxyyyyyyzbbb 压缩为 3x5yz2b
public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.nextLine().toCharArray();
//遍历字符串
        for(int i = 0; i < str.length; i++)
        {
//用来记录重复字符数量
            int cnt = 0;
            if(i == str.length - 1)
            {
                System.out.print(str[i]);
                continue;
            }
//判断是不是字符串中的重复字符
            while(str[i] == str[i+1])
            {
                i++;
                cnt++;
                if(i > str.length - 2)
                    break;
            }
            //先输出压缩的字符个数
            if(cnt != 0)
            {
                System.out.print(cnt);
            }
            //再输出被压缩的字符
            System.out.print(str[i]);
        }
        System.out.println();
    }
}



