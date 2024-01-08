import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(!list.contains(a[i]))list.add(a[i]);
        }
         for(int i=0;i<b.length;i++){
            if(!list.contains(b[i]))list.add(b[i]);
        }
        Collections.sort(list);
        return list;
    }
}