
class Solution {
    public int[] runningSum(int[] nums) {
        int ans = nums.length;
        for(int i=1;i<ans;i++) {
            nums[i] = nums[i-1]+nums[i];
        }
    return nums;
    }
}
