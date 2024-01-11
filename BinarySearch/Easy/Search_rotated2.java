class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        if(n==1 && nums[0]==target)return true;
        for(int i=0;i<=n/2;i++){
            if(nums[i]==target){
                return true;
            }
            else if(nums[n-i-1]==target)return true;
        }
        return false;
    }
}