import java.util.Arrays;

class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; ) {
            int j = i;  
            while (j < n && arr[j] - arr[i] <= k) {
                j++;
            }
            count++;
            i = j; 
        }
        return count;
    }
}