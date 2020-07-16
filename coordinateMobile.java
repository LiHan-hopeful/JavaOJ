import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
         
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
             
            String[] str = s.split(";");
             
            int row = 0;
            int column = 0;
             
            for (int i = 0; i < str.length; i++) {
                if (str[i].length() <= 3) {
                    if (str[i].charAt(0) == 'A' && str[i].substring(1).matches("[0-9]+")) {
                            row -= Integer.parseInt(str[i].substring(1));
                    }
                     
                    if (str[i].charAt(0) == 'D' && str[i].substring(1).matches("[0-9]+")) {
                            row += Integer.parseInt(str[i].substring(1));
                    }
                     
                    if (str[i].charAt(0) == 'W' && str[i].substring(1).matches("[0-9]+")) {
                            column += Integer.parseInt(str[i].substring(1));
                    }
                     
                    if (str[i].charAt(0) == 'S' && str[i].substring(1).matches("[0-9]+")) {
                            column -= Integer.parseInt(str[i].substring(1));
                    }
                }
            }
             
            System.out.println(row + "," + column);
        }
         
    }
}