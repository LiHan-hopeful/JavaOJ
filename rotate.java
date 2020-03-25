public void rotate(int[] nums, int k) {
    int[] a = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        a[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
        nums[i] = a[i];
    }
}//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
