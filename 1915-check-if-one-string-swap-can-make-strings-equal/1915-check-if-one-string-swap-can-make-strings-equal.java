class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int l1 = s1.length();
        if (l1 != s2.length()) {
            return false;
        }

        char a = ' ', b = ' ', c = ' ', d = ' ';

        for (int i = 0; i < l1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    a = s1.charAt(i);  
                    c = s2.charAt(i); 
                } else if (count == 2) {
                    b = s1.charAt(i); 
                    d = s2.charAt(i); 
                } else {
                    return false;  
                }
            }
        }

        return count == 0 || (count == 2 && a == d && b == c);
    }
}
