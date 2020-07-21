import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int wordsNum = scanner.nextInt();
            String[] dict = new String[wordsNum];
            for (int i = 0; i < wordsNum; i++) {
                dict[i] = scanner.next();
            }
            String target = scanner.next();
            int brotherIndex = scanner.nextInt();
            process(dict, target, brotherIndex);
            scanner.nextLine();
        }
    }
     
    public static void process(String[] dict, String target, int brotherIndex) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(dict);
        for (String cur : dict) {
            if (isBrother(target, cur)) {
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if (brotherIndex <= list.size() && list.size() > 0) {
            System.out.println(list.get(brotherIndex - 1));
        }
    }
     
    public static boolean isBrother(String target, String cur) {
        if (target.equals(cur)) {
            return false;
        }
        if (target.length() != cur.length()) {
            return false;
        }
        char[] targetArray = target.toCharArray();
        char[] curArray = cur.toCharArray();
        Arrays.sort(targetArray);
        Arrays.sort(curArray);
        for (int i = 0; i < curArray.length; i++) {
            if (targetArray[i] != curArray[i]) {
                return false;
            }
        }
        return true;
    }
}