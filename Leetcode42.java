//leetcode 42 - trapping rain water
class Solution {
    public int trap(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int leftMax=0;
        int rightMax=0;
        int res=0;
        while(left<=right){
            if(nums[left]<=nums[right]){
                if(nums[left]>=leftMax){
                    leftMax=nums[left];
                } else {
                    res+=leftMax-nums[left];
                }
                left++;
            } else {
                if(nums[right]>=rightMax){
                    rightMax=nums[right];
                } else {
                    res+=rightMax-nums[right];
                }
                right--;
            }
        }
        return res;
    }
}