class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int l1 = s1.length();
        if (l1 != s2.length()) {
            return false;
        }

        int count = 0;
        int first = -1, second = -1; // Store mismatch indices
        
        for (int i = 0; i < l1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    first = i; // First mismatch index
                } else if (count == 2) {
                    second = i; // Second mismatch index
                } else {
                    return false; // More than 2 mismatches → Can't swap
                }
            }
        }
        
        // If count is 0, strings are already equal
        if (count == 0) return true;
        
        // If exactly 2 mismatches, check if swapping makes s1 == s2
        return count == 2 && 
               s1.charAt(first) == s2.charAt(second) && 
               s1.charAt(second) == s2.charAt(first);
    }
}
