import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        int count = 0;
        while (sc.hasNextLine()) {
            String str_1 = sc.nextLine();
            mapDispose(map, str_1);
        }
            for (String st : map.keySet()) {
                count++;
                if (count > (map.size() - 8)) {
                    System.out.println(st + " " + map.get(st));
                }
            }
    }
     
    public static void mapDispose(Map<String, Integer> map, String str) {
        String[] strArr = str.split("\\s+");
        String[] nameArr = strArr[0].split("\\\\");
        int num = Integer.parseInt(strArr[1]);
        String name = nameArr[nameArr.length - 1];
        if (name.length() > 16) {
            name = name.substring(name.length() - 16);
        }
        String key = name + " " + num;
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}