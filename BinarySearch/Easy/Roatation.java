public class Solution {
    public static int findKRotation(int []arr){
        int count=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count=i;
            }
        }
        return count+1;
    }
}