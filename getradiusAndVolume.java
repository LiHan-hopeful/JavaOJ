import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int[] num = new int[6];
            for(int i = 0; i < 6; i++){
                num[i] = scanner.nextInt();
            }
            double r = 0;
            double a = Math.pow(num[3] - num[0],2);
            double b = Math.pow(num[4] - num[1],2);
            double c = Math.pow(num[5] - num[2],2);
            r = Math.sqrt(a + b + c);
            double v =(4*Math.acos(-1)*Math.pow(r,3)) / 3;
            System.out.printf("%.3f", r);
            System.out.print(" ");
            System.out.printf("%.3f", v);
        }
    }
}