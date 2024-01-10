import java.util.*;

public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // int n = a.length;
         List<Integer> list= new ArrayList<>();
        // for(int i=0;i<n-1;i++){
        //     boolean ans=true;
        //     for(int j=i+1;j<n;j++){
        //        if(a[i]<a[j])ans=false;
        //     }
        //     if(ans && !list.contains(a[i]))list.add(a[i]);
        // }
        // list.add(a[n-1]);
        int max=Integer.MIN_VALUE;

for(int i=a.length-1;i>=0;i--){

    if(a[i]>max){

        list.add(a[i]);

        max=a[i];

    }
        //Collections.sort(list);
        
    }
    return list;
}
}