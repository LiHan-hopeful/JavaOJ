import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String sample = scanner.next();
        String target = scanner.next();
        int length = sample.length();
        for (int i = 0; i < length; i++) {
            map.merge(sample.charAt(i), 1, Integer::sum);
        }
        int targetLen = target.length();
        int leak = 0;//缺少
        char ch;
        for (int i = 0; i < targetLen; i++) {
            ch = target.charAt(i);
            Integer value = map.get(ch);
            if (value == null || value == 0) {
                leak++;
            }else {
                map.put(ch, value-1);
            }
        }
        if (leak == 0) {
            System.out.println("Yes " + (length - targetLen));
        } else {
            System.out.println("No " + leak);
        }
        scanner.close();
    }
}