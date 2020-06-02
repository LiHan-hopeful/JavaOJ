import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int num = scanner.nextInt();//空汽水瓶数
            if(num == 0) {
                break;
            }
            int count = 0;//能喝汽水瓶数
            while(num > 1) {
                if(num == 2) {
                    count++;
                    break;
                }
                count += num / 3;
                num = num / 3 + num % 3;
            }
            System.out.println(count);
        }
    }
}