import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t=scanner.nextInt();
        for(int x=0;x<t;x++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[2*n];
            int[] newArr=new int[2*n];
            for(int y=0;y<2*n;y++){
                arr[y]=scanner.nextInt();
            }
            for(int i=0;i<k;i++){
                for(int j=0;j<n;j++){
                    newArr[2*j]=arr[j];
                    newArr[2*j+1]=arr[n+j];
                }
                System.arraycopy(newArr,0,arr,0,newArr.length);
            }
            if(arr.length>0){
                System.out.print(arr[0]);
            }
            for(int z=1;z<2*n;z++) {
                System.out.print(" " + arr[z]);
            }
            System.out.println();
        }
    }
}