class Solution {
    public int majorityElement(int[] nums) {
        int target = nums[0];//初始化为数组的第一个元素，接下来用于记录上一次访问的值
		int count = 1;//用于记录出现次数
		for(int i = 1;i<nums.length;i++) {
			if(target == nums[i]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {//当count=0时，更换target的值为当前访问的数组元素的值，次数设为1
				target = nums[i];
				count = 1;
			}
		}
		return target;
    }
}
