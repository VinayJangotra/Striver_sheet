import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
       Arrays.sort(arr);
       return arr[n-1];
    }
    // IInd Appraoch
    static int largestElement(int[] arr, int n) {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
         if(arr[i]>max){
            max=arr[i];
         }
       }
       return max;
    }
}

