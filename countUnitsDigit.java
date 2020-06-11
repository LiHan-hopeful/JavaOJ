import java.util.Scanner;
 
public class Main {
    static int[] a =new int[10];
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);  
        String str = scanner.next();
        for(int i =0;i<str.length();i++){
            a[str.charAt(i)-48]++;
        }
 
        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                System.out.println(i+":"+a[i]);
            }
        }
    }