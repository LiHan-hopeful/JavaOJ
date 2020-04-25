import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 0; ; i++){
            if(feibo(i) > num){
                a = feibo(i);
                b = feibo(i-1);
                break;
            }
        }
        int count1 = num-b;
        int count2 = a-num;
        if(count1>count2){
            System.out.println(count2);
        }else{
            System.out.println(count1);
        }
    }

    private static int feibo(int num) {
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return feibo(num - 1) + feibo(num - 2);
    }
}