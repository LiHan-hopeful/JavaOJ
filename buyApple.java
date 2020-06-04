import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(buyApple(num));
    }
    public static int buyApple(int n){
        if(n<6||n==10||n%2!=0){
            return -1;
        }
        if(n%8 == 0 ){
            return n/8;
        }
       
        return n/8 + 1;
    }
}