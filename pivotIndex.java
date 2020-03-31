class Solution {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < nums.length; i++) {
        rightsum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rightsum -= nums[i];
            if (leftsum == rightsum) {
                ans = i;
                break;
            } else {
                leftsum += nums[i];
            }
        }
        return ans;
    }
}

