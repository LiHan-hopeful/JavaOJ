import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> martic = new HashSet<String>();
        while (scanner.hasNext()){
            String s = scanner.next();
            String[] temp = s.split(" ");
            for(int i = 0; i < temp.length; i++){
                martic.add(temp[i]);
            }
        }
        System.out.println(martic.size());
    }
}