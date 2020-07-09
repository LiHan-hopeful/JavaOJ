public class Main{
    public static void main(String[] args){
        int result = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 30; i++){
            result = (int)Math.pow(2,i);
            sum2 += result;
        }
        sum1 = 30 * 10;
        System.out.print(sum1);
        System.out.printf(" ");
        System.out.print(sum2);
    }
}