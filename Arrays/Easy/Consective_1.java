class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count=0;
       int max=-1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==1)count=count+1;
           else{
               max=Math.max(max,count);
               count=0;
           }
       } 
       return Math.max(max,count);
    }
}