import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        char c = scanner.next().charAt(0);

        for (int i = 0; i < (num + 1) / 2; i++) {
            for (int j = 0; j < num; j++) {
                if(i == 0 || j == 0 || i == ((num+1)/2 - 1) || j == num-1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
