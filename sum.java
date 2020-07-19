import java.util.ArrayList;
import java.util.Scanner;
 
public class Main{
  static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
  static ArrayList<Integer> list = new ArrayList<>();
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = 0;
     int m = 0;
    while(scanner.hasNext()) {
      n = scanner.nextInt();
      m = scanner.nextInt();
      findSum(1, m, n);
      for(ArrayList<Integer> l : res) {
        int i = 0;
        for(; i < l.size() - 1; i++) {
          System.out.print(l.get(i) + " ");
        }
        System.out.println(l.get(i));
      }
    }
  }
   
  public static void findSum(int index, int count, int n) {
    if(count == 0) {
      res.add(new ArrayList<>(list));
    }
    else {
      for(int i = index; i <= count && i <= n; i++) {
        list.add(i);
        findSum(i + 1, count - i, n);
        list.remove(list.size() - 1);
      }
    }
  }
}