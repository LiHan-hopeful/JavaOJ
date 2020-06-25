import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int num[]=new int[N];
        int A1=0;
        int A2=0;
        int A3=0;
        int A4=0;
        int A5=0;
        int flag=1;
        int count=0;
        for(int i=0;i<N;i++){
             num[i]=scanner.nextInt();
            if(num[i]%5==0){
                if(num[i]%2==0)
                A1+=num[i];
            }
            if(num[i]%5==1){
                    A2+=flag*num[i];
                    flag=-flag;
            }
             if(num[i]%5==2){
                A3++;
            }
             if(num[i]%5==3){
                A4+=num[i];
                count++;
            }
             if(num[i]%5==4){
                if(num[i]>A5)
                    A5=num[i];
            }
        }
        if(A1!=0){System.out.print(A1+" ");}
        else{System.out.print('N'+" ");}
        if(A2!=0){System.out.print(A2+" ");}
        else{System.out.print('N'+" ");}
        if(A3!=0){System.out.print(A3+" ");}
        else{System.out.print('N'+" ");}
        if(A4!=0){System.out.print(A4/count+"."+(int)((A4%count*100/count+5)/10)+" ");}
        else{System.out.print("N"+" ");}
        if(A5!=0){System.out.print(A5);}
        else{System.out.print("N");}
    }
}