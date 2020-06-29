import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            scanner.nextLine();
            LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
            String str1 = scanner.nextLine();
            String[] array1=str1.split(" ");
            for(int i=0;i<array1.length;i++){
                map.put(array1[i],0);
            }
            map.put("Invalid",0);

            int m = scanner.nextInt();
            scanner.nextLine();
            String str2 = scanner.nextLine();
            String[] array2 = str2.split(" ");
            for(String s:array2){
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String> set=map.keySet();
            for(String s:set){
                System.out.println(s+" : "+map.get(s));
            }
        }
    }
}
