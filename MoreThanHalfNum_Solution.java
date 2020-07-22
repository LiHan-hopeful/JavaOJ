import java.util.Arrays;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null){
            return 0;
        }
        Arrays.sort(array);
        int target = array[array.length/2];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(target == array[i]){
               count++;
            }
        } 
        if(count > array.length/2){
           return target;
        } 
        return 0;
    }
}