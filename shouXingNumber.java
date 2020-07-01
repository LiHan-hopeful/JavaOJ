import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num1 = scanner.nextInt();
            int num2 = (int)Math.pow(num1,2);
            String s1 = ""+num2;
            String s2 = s1.substring(1);
            if(s2.length() > 0) {
                int n3 = Integer.parseInt(s2);
                if (num1 == n3) {
                    System.out.println("Yes!");
                } else {
                    System.out.println("No!");
                }
            }else {
                System.out.println("No!");
            }
        }
    }
}