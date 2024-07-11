class Solution {
  public static int[] count_NGEs(int N, int arr[], int que, int indi[]) {
    // code here
      int[] ans = new int[indi.length];
    for (int i = 0; i < indi.length; i++) {
        int count = 0;
        int num = arr[indi[i]];
        for (int j = indi[i]; j < N; j++) {
            if (num < arr[j]) {
                count++;
            }
        }
        ans[i] = count;
    }
    return ans;
  }
}
