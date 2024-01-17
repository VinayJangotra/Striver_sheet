public final class Solution {
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low=Integer.MAX_VALUE; int high=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][n-1]);
        }
        int ans=-1;
        int need=n*m/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ok=solve(matrix,mid);
            if(ok>need){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static int solve(int arr[][],int k){
        int m=arr.length; int n=arr[0].length; int count=0;
        for(int i=0;i<m;i++){
            int low=0; int high=n-1; int ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[i][mid]<=k){
                    ans=mid;
                    low=mid+1;
                }
                else high=mid-1;
            }
            count+=ans+1;
        }
        return count;
    }
}