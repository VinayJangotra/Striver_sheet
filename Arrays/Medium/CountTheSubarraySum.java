
class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
    //   int count=0;
    //   for(int i=0;i<N;i++){
    //       int sum=0;
    //       for(int j=i;j<N;j++){
    //           sum+=Arr[j];
    //           if(sum==k)count++;
    //       }
    //   }
    //   return count;
      Map<Integer,Integer> map = new HashMap<>();
      int prefixSum=0,cnt=0;
      map.put(0,1);
      for(int i=0;i<N;i++){
          prefixSum+=Arr[i];
          int remove=prefixSum-k;
          cnt+=map.getOrDefault(remove,0);
          map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
      }
      return cnt;
    }
}