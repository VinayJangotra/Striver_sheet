int longestSubarrayWithSumK(vector<int> a, long long k) {
     int left=0;

     int right=0;

     int n= a.size();

     long long sum=a[0];

     int maxlen=0;

     while(right<n){

       while(left<=right && sum>k){

          sum-=a[left];

          left++;

       }

       if(sum==k){

         maxlen=max(maxlen,right-left+1);

       }

        

         right++;

         if(right<n) sum+=a[right];

     }

 

     return maxlen;


}