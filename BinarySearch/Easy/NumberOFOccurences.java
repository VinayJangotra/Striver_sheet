public class Solution {
    public static int count(int arr[], int n, int x) {
        int low=first(arr,n,x);
        int high=second(arr,n,x);
        if(low==-1)return 0;
        return (high-low+1);
    }
    public static int first(int arr[],int n,int x){
       int start=0;
       int end=arr.length-1;
       int ans=-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]==x){
               ans=mid;
               end=mid-1;
           }
           else if(arr[mid]>x)end=mid-1;
           else start=mid+1;
       }
       return ans;
    }
    public static int second(int arr[],int n,int x){
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>x)end=mid-1;
            else start=mid+1;
        }
        return ans;
    }
}