//https://www.geeksforgeeks.org/problems/rotation4723/

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int k=0;
	    if(arr[n-1]>arr[0])return k;
	    else{
	        for(int i=0;i<n-1;i++){
	            if(arr[i]<arr[i+1])k++;
	            else break;
	        }
	    }
	    return k+1;
    }
}
