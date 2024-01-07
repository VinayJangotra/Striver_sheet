import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
       int arr[]= new int[2];
       Arrays.sort(a);
       arr[0]=a[n-2];
       arr[1]=a[1];
       return arr;
    }
}