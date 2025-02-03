class Solution {
    public boolean searchMatrix(int[][] arr, int n) {
        int a = arr.length;
        int b = arr[0].length;

        for (int i=0; i<a ; i++){
            for (int j=0; j<b; j++){
                if (arr[i][j] == n){
                    return true;
                }
            }
        }
        return false;

        
    }
}