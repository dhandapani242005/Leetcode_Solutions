class Solution {
    public int[] applyOperations(int[] arr) {
        int nz =0;
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            if (arr[i] == arr[i+1]){
                arr[i] = arr[i] * 2;
                arr[i+1] = 0; 
            }
           else continue;
        }

        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                arr[nz] = arr[i];
                nz++;
            }
        }

        for (int i=nz; i<n; i++){
            arr[i] = 0;

        }
        return arr;
        
    }
}