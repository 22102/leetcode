class Solution {
    public void rotate(int[] nums, int k) {
        //移动K次数组
        for(int i = k; i > 0; i--) {
            for(int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = nums[nums.length - 1];
                nums[nums.length - 1] = temp;
            }
        }
    }
}
