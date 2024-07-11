class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int n=nums.length;
      int ans[]= new int[n];
      int temp[]=new int[n+n];
      int j=0;
      for(j=0;j<n;j++){
        temp[j]=nums[j];
      }
      int k=0;
      for(int i=n;i<2*n;i++){
        temp[i]=nums[k++];
      }
      Stack<Integer> st = new Stack<Integer>();
      st.push(temp[n-1]);
      int m=temp.length;
      for(int i=m-2;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=temp[i]){
            st.pop();
        }
        int num=st.isEmpty()?(-1):st.peek();
        ans[i%n]=num;
        st.push(temp[i]);
      }

      return ans;
    }
}
