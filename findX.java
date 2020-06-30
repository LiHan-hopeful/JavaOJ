import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = scanner.nextInt();
            }
            int x = scanner.nextInt();
            int index = -1;
            for(int i=0; i<n; i++) {
                if(arr[i] == x) {
                    index = i;
                }
            }
             System.out.println(index);
        }
    }
}