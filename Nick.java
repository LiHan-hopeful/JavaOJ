import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(getString(num));
        }
    }
 
    public static String getString(int num){
        if(num == 1 ){
            return "1";
        }else {
            int base = num * (num -1);
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<num ; i++){
                sb.append("+").append(base + 2 * i + 1);
            }
            return sb.toString().substring(1);
        }
    }
}