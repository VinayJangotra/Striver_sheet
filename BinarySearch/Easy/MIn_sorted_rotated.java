class Solution {
    public int findMin(int[] nums) {

        int n= nums.length;
        if(n==1)return nums[0];
        if(n==0)return -1;
        if(nums[0]<nums[n-1])return nums[0];
        else {
            for(int i=n-1;i>=0;i--){
                if(nums[i]<nums[i-1])return nums[i];
            }
        }
        return -1;
    }
}