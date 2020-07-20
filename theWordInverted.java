import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("[^a-zA-Z]+");
        StringBuilder str2 = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--)
            str2.append(str[i] + " ");
        System.out.println(str2.toString().trim());
    }
}
