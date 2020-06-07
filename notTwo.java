import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int evenICount = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2);
        int oddICount = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2);
        int ans = m / 4 * (evenICount + oddICount) * 2;
        if(m % 4 > 0) {
            ans += evenICount;
        }
        if(m % 4 > 1)  {
            ans += evenICount;
        }
        if(m % 4 > 2)  {
            ans += oddICount;
        }
        System.out.println(ans);
    }
}
