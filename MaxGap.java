import java.util.*;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max1=A[0]; 
        int max=Math.abs(A[0]-A[A.length-1]); 
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max1=A[i];
            }
            int max2=A[A.length-1];
            for(int j=A.length-1;j>i;j--){
                if(A[j]>max2){
                    max2=A[j];
                }
                if(Math.abs(max1-max2)>max){
                    max=Math.abs(max1-max2);
                }
            }
        }
        return max;
    }
}