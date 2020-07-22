import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    while (scanner.hasNext()){
      String str = scanner.next();
      int num = scanner.nextInt();
      String[] arr = str.split("\\\\");
      String a = arr[arr.length - 1];
      if(a.length() > 16){
        a = a.substring(a.length() - 16);
      }
      String key = a + " " + num;
      int val = 1;
      if(map.containsKey(key)){
        map.put(key,map.get(key) + 1);
      }else {
        map.put(key,val);
      }
    }
    int count = 0;
    for (String s : map.keySet()) {
      count++;
      if(count>(map.keySet().size() - 8)){
        System.out.println(s + " " + map.get(s));
      }
    }
  }
}