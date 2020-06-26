import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext())
        {
            int n=scanner.nextInt();
            int init=scanner.nextInt();
            int[] monster=new int [n];
            for(int i=0;i<n;i++)
            {
                monster[i]=scanner.nextInt();
                if(init>monster[i])
                {
                    init+=monster[i];
                }
                else
                {
                    init+=GetGYS(init,monster[i]);
                }
            }
            System.out.println(""+init);
        }
    }

    public static int GetGYS(int n,int m)
    {
        if(m%n==0)
            return n;
        else
        {
            return GetGYS(m%n,n);
        }

    }
}
