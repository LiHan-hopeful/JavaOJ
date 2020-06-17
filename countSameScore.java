import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            if (N == 0) {
                return;
            }
            int[] grade = new int[N];
            for (int i = 0; i < grade.length; i++) {
                grade[i] = scanner.nextInt();
            }
            int T = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < grade.length; i++) {
                if (T == grade[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}