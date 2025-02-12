class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n = arr.length;
        int out[] = new int[2];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i!=j){
                 if (arr[i]+arr[j] == t){
                out[0] = i;
                out[1] = j;
                break;     
                }
            }
        }
           
    }
        return out;
    }
}