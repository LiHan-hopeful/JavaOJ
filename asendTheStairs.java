import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        int[] arr = {1, 2, 4};
        if(n <= 0){
            return 0;
        } else if(n <= 3){
            return arr[n-1];
        } else {
            for(int i = 4; i <= n; i++){
                int tmp = ((arr[0] + arr[1]) % 1000000007 + arr[2]) % 1000000007;
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = tmp;
            }
        }
        return arr[2];
    }
}
