import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int num1 = scanner.nextInt();
            int num2 = (int)Math.pow(num1, 2);
            String str1 = String.valueOf(num1);
            String str2 = String.valueOf(num2);
            char [] ch1 = str1.toCharArray();
            char [] ch2 = str2.toCharArray();
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < ch1.length; i++){
                sum1+=Integer.parseInt(String.valueOf(ch1[i]));
            }
            for(int i = 0; i < ch2.length; i++){
                sum2+=Integer.parseInt(String.valueOf(ch2[i]));
            }
            System.out.println(sum1 +" " +sum2);
        }
    }
}