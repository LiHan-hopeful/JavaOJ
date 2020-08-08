public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            //如果可以到达当前位置，则更新最大
            if (i <= rightmost) {
                //每次更新最大的位置
                rightmost = Math.max(rightmost, i + nums[i]);
                //如果可以到达最后一个位置，则直接返回
                if (rightmost >= n - 1) {
                    return true;
               }
           }
       }
       return false;
   }
}
