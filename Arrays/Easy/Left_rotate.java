import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int d) {
        int n = arr.size();
        Collections.reverse(arr.subList(0,d));
        Collections.reverse(arr.subList(d,n));
        Collections.reverse(arr.subList(0,n));
        return arr;
    }
}
