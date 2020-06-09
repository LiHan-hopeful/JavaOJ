import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0) {
            String str = String.valueOf(num);
            StringBuffer buffer = new StringBuffer(str);
            System.out.println(buffer.reverse());
        }
    }
}