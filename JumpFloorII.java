public class Solution {
    public int JumpFloorII(int target) {
       //方法一
        int result = 1;
        for(int i = 2; i <= target; i++){
            result *= 2;
        }
        return result;
      //方法二
   //  return 1 << (target -1);
    }
}