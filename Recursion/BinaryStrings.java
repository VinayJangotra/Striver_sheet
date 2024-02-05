import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void fun(int i,int n,List<String>ans,String s){
        if(i>=n){
           ans.add(s);
           return;
        }
        // Take
        String temp=s;
        s+='1';
        if(s.length() != n)s+='0';
        fun(i+2,n,ans,s);
        s=temp;
        s+='0';
        fun(i+1,n,ans,s);
            
        }
    public static List< String > generateString(int N) {
       List<String> ans = new ArrayList<>() ;
       fun(0,N,ans,"");
       Collections.sort(ans);
       return ans;
    }
}
