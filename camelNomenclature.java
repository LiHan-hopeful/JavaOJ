import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNext()){
      String str1 = scanner.next();
      char[] array = str1.toCharArray();
      int i = 0;
      StringBuilder str2 = new StringBuilder();
      while(i < array.length){
        if(array[i] != '_'){
          str2.append(array[i]);
          i++;
        } else {
          i++;
          str2.append((array[i]+"").toUpperCase());
          i++;
        }
      }
      System.out.println(str2.toString());
    }
  }
}