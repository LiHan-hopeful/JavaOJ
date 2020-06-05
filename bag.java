import java.util.Scanner;
public class Main {
  public static int count;//解决方案的个数
  public static int[] arr;//保存物体的体积
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    arr = new int[n + 1];
    int i = 1;
    while (sc.hasNext()) {
      arr[i] = sc.nextInt();
      i++;
    }
    bag(40, n);
    System.out.println(count);
  }
  
  public static void bag (int s, int n) {
    if (s == 0) {
      count++;
      return;
    }
    if (s < 0 || (s > 0 && n <= 0)) {
      return;
    }
    bag(s - arr[n], n - 1);//从最后一个装
    bag (s, n - 1);//从倒数第二个开始装
  }
}