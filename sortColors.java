class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int zero = -1;
        int two = len - 1;
        int i = 0;
        while (i <= two) {
            if (nums[i] == 0) {
                zero++;
                swap(nums, i, zero);
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, two);
                two--;
            }
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}