import java.util.HashMap;

public class Solution {

	public static int kDistinctChars(int k, String str) {
		// Write your code here
		HashMap<Character,Integer> map = new HashMap<>();
	    int left=0,right=0,len=0;
		int n=str.length();
		while(right<n){
            char currChar= str.charAt(right);
			map.put(currChar,map.getOrDefault(currChar, 0)+1);
			right++;

			if(map.size()>k){
				char leftChar= str.charAt(left);
				map.put(leftChar,map.get(leftChar)-1);
				if(map.get(leftChar)==0){
					map.remove(leftChar);
				}
				left++;
			}     
			len=Math.max(len,right-left);
		}
		return len;
	}

}
