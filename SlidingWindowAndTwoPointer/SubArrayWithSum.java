class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans=0,sum=0;
        map.put(0,1);
        for(int i : nums){
            sum+=i;
            ans+=map.getOrDefault(sum - goal, 0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
