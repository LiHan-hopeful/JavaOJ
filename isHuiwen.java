import java.util.Scanner;
import java.lang.*;
 
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.next();
        char[] c=str.toCharArray();
        String sb=null;
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            if(i==0){
               sb=str.substring(1,str.length());
            }
            else if(i==str.length()-1){
                sb=str.substring(0,str.length()-1);
            }
            else{
                sb=str.substring(0,i-1)+str.substring(i+1,str.length());
            }
            flag=isHuiwen(sb);
            if(flag==true){
            System.out.println("YES");
            break;
            }
             
    }
        if(flag==false){
        System.out.println("NO");
        }
    }          
        }
 
    private static boolean isHuiwen(String sb) {
         char[] c=sb.toCharArray();
         int len=sb.length();
         int begin=0;
         int end=len-1;
         boolean flag=false;
         while(begin<=end&&c[begin]==c[end]){
             begin++;
             end--;
         }
         if(begin>=end){
             flag=true;
         }
         return flag;
    }
}