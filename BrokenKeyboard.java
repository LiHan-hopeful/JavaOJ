import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 1. 循环读入两个字符串. 第一个字符串是预期输出的内容; 第二个字符串是实际输出的内容
            String expected = scanner.next();
            String actual = scanner.next();
            // 2. 把读入的两个字符串全都转成大写(根据题目的输出示例).
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            // 3. 创建一个 Set 保存实际哪些字符输出了
            Set<Character> actualSet = new HashSet<>();
            for (int i = 0; i < actual.length(); i++) {
                actualSet.add(actual.charAt(i));
            }
            // 4. 遍历预期输出的字符串, 看看哪个字符没有被实际输出
            Set<Character> brokenKeySet = new HashSet<>();
            for (int i = 0; i < expected.length(); i++) {
                char c = expected.charAt(i);
                if (actualSet.contains(c)) {
                    continue;
                }
                if (brokenKeySet.contains(c)) {
                    // 此处的 brokenKeySet 用于辅助去重. 防止同一个坏键被打印多次
                    continue;
                }
                System.out.print(c);
                brokenKeySet.add(c);
            }   // end for
        }  // end while
    }
}