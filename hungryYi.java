import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long x_0=scanner.nextLong();
        long m=1000000007;
        long s=100000;
 
        long[] begin=new long[3];
 
        begin[0]=x_0;
        begin[1]=(4*begin[0]+3)%m;
        begin[2]=(4*begin[1]+3)%m;
 
        long minStep = s;
        long cur = 0;
        long step = 0;
        for (int i=0;i<3;i++){
            cur=begin[i];
            step=i;
            while (cur!=0 && step<minStep){
                cur=(8*cur+7)%m;
                step++;
            }
            minStep=minStep<step?minStep:step;
        }
        if (minStep<s){
            System.out.println(minStep);
        }else {
            System.out.println(-1);
        }
 
    }
}