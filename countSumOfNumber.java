import java.util.*;

public class Main{
    public static long bag(int []weight,int n,int sum){
        long dp[] = new long[sum+1];
        dp[0] = 1;
        for(int i=0;i<n;i++){
            for(int j=sum;j>=weight[i];j--){
               dp[j]=dp[j-weight[i]]+dp[j];
            }
        }
        return dp[sum];
    }
    
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(bag(arr,n,sum));
    }
}