class Solution {
    public int characterReplacement(String s, int k) {
        int right=0,left=0,maxlen=0,maxfreq=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        while(right<n){
            char rightChar=s.charAt(right);
            map.put(rightChar,map.getOrDeafault(rightChar,0)+1);
            maxfreq=Math.max(maxfreq,map.get(rightChar));

            if((right-left+1)-maxfreq>k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}
