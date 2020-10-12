import java.util.Scanner;

//4.递增子序列瓜子二手车2019秋招
public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
          int[] a = new int[n];
          for (int i = 0; i < n; i++) {
              a[i] = scanner.nextInt();
          }
          int first = a[0], second = Integer.MAX_VALUE;
          for (int i = 1; i < n; i++) {
              if (a[i] < first) {
                  first = a[i];
                  //如果更新了最小值，则第二小的值需要在后面找，所以此处需要更新
                  second = Integer.MAX_VALUE;
              }
              else if (a[i] > first && a[i] < second){
                  second = a[i];
              }

              else if (a[i] > first && a[i] > second) {
                  System.out.println("true");
                  return;
              }
          }
          System.out.println("false");
    }


}

