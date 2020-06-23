import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char[] arr = str.toCharArray();
            int len = str.length();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < len; i++) {
                char c = arr[i];
                if(c!=' '){
                    if(c>'E'){
                        c=(char)((int)c-5);
                    }
                    else{
                        c=(char)((int)c-65+86);
                    }
                }
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}