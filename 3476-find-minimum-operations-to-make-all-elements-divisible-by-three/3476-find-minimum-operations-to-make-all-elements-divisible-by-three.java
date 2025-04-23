class Solution {
    public int minimumOperations(int[] arr) {
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 3 !=0 ) count++;
        }
        return count;
    }
}