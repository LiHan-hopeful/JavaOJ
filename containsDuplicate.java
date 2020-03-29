class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i < nums.length; i++){
     for (int j=0; j < i; j++){
           if(nums[i] == nums[j]){
               return true;
           }
      }
}
return false;
    }
}//给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。