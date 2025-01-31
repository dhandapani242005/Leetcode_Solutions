class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;  // Start with 'n'
        
        // XOR all indices and array values
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];  // XOR index and value
        }
        
        return missing;  // The missing number remains
    }
}
