import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
       int[] B = new int[A.length];
        if(A.length==0){return B;}
        for(int i=0;i<A.length;i++){
            int m = 1;
            int k=0;
            while(0<=k&&k<i){
                m *= A[k];
                k++;
            }
            k++;
            while(i<k&&k<=A.length-1){
                m *= A[k];
                k++;
            }
            B[i]=m;
        }
        return B;
    }
}