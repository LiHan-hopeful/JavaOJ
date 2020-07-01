import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String str = judge(s);
            String str2 = compare(s);
            if(str.equals(str2)){
                System.out.println(str);
 
            } else{
                System.out.println("NG");
            }
        }
    }
    public static String judge(String s){
        int len = s.length();
        if(len <=8 ){
            return "NG";
        }
        int[] nums = new int[4];
        for(int i = 0;i<len;i++){
            if(s.charAt(i)>47 && s.charAt(i)<=57){
                nums[0]++;
            }else if(s.charAt(i)>=65 && s.charAt(i)<=90 ){
                nums[1]++;
            }else if(s.charAt(i)>=97 && s.charAt(i)<=122 ){
                nums[2]++;
            }else{
                nums[3] ++;
 
            }
        }
        int count = 0;
        for(int i:nums){
            if(i >0){
                count ++;
            }
        }
        if(count <3){
            return "NG";
        }
        return "OK";
    }
    public static String compare(String s){
        int len = s.length();
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                int count = 0;
                int a = i;
                int b = j;
                while(a<len && b<len &&(s.charAt(a) == s.charAt(b))){
                    count ++;
                    a++;
                    b++;
                }
                if(count >2){
                    return "NG";
                }
            }
        }
        return "OK";
    }
}