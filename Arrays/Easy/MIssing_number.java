class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)return i;
        }
        if(nums.length!=nums[nums.length-1])return nums.length;
        return -1;
    }
}