class Solution {
    public String longestCommonPrefix(String[] strs) {
       int n=strs.length;
       if(n==0)return "";
       if(n==1) return strs[0];
       StringBuffer str= new StringBuffer("");
       Arrays.sort(strs);
       for(int i=0;i<strs[0].length();i++){
           if(strs[0].charAt(i)==strs[n-1].charAt(i)){
               str.append(strs[0].charAt(i));
           }
           else{
               break;
           }
       }
       return str.toString();
    }
}