class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(var e:map.entrySet()){
            if(e.getValue()>nums.length/3){
                list.add(e.getKey());
            }
        }
        return list;
    }
}