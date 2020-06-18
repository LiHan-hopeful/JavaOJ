import java.util.*;
 
public class Main {
    static ArrayList<String> l=new ArrayList<String>();    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            while(in.hasNext()) {
                l.clear();    
                int nums=in.nextInt();
                int[] id=new int[nums];
                Stack<Integer> stack=new Stack<Integer>();
                for(int i=0;i<nums;i++) {
                    id[i]=in.nextInt();
                }
                trainOut(id,0,stack,"",0);
                Collections.sort(l);    
                for(String str:l) {
                    System.out.println(str);
                }
            }
            in.close();
    }
    public static void trainOut(int[] id,int i,Stack<Integer> s,String str,int n) {
        if(n==id.length) {
            l.add(str);    
        }
        if(!s.empty()) {       
            int temp=s.pop();
            trainOut(id,i,s,str+temp+" ",n+1);
            s.push(temp);    
        }
        if(i<id.length) {    
            s.push(id[i]);   
            trainOut(id,i+1,s,str,n);
            s.pop();        
        }          
    }
}