import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = 0;
        for(int i = 0; i <= str1.length(); i++) {
            StringBuilder str3 = new StringBuilder(str1);
            str3.insert(i,str2);
            if(isPalindrom(str3.toString())){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}