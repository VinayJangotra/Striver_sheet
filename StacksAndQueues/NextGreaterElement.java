class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> st = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();
    int n = nums2.length;

    st.push(nums2[n - 1]);
    map.put(nums2[n - 1], -1);

    for (int i = n - 2; i >= 0; i--) {
        while (!st.isEmpty() && st.peek() <= nums2[i]) {
            st.pop();
        }
        int num = st.isEmpty() ? -1 : st.peek();
        map.put(nums2[i], num);
        st.push(nums2[i]);
    }

    int m = nums1.length;
    int[] ans = new int[m];
    for (int i = 0; i < m; i++) {
        ans[i] = map.get(nums1[i]);
    }

    return ans;
    }
}
