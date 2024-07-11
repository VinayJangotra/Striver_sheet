import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();
        
        st.push(arr.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr.get(i)) {
                st.pop();
            }
            int num = st.isEmpty() ? -1 : st.peek();
            ans.set(i, num);
            st.push(arr.get(i));
        }
        return ans;
    }
}
