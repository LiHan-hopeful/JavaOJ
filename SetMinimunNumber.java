import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != 0) {
                sb.append(i);
                list.set(i, list.get(i) - 1);
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                for (int j = 0; j < list.get(i); j++) {
                    sb.append(i);
                }
            }
        }

        System.out.println(sb.toString());
    }
}