class Solution {
    public boolean searchMatrix(int[][] arr, int num) {
        int m = arr.length;
        int n = arr[0].length;
        
        int row = 0, col = n - 1; // Start from the top-right corner
        
        while (row < m && col >= 0) {
            if (arr[row][col] == num) return true; // Found the target
            else if (arr[row][col] < num) row++; // Move downward
            else col--; // Move leftward
        }
        
        return false; // Target not found
    }
}
