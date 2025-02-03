class Solution {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if (n != m) {
            return -1;
        }
        
        int xmis = 0;  
        int ymis = 0; 
        

        for (int i = n-1; i >= 0; i--) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xmis++;
            } else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                ymis++;
            }
        }
        
		
        if (xmis % 2 != ymis % 2) {
            return -1;
        }
        
        int ans = xmis / 2 + ymis / 2; 
        if (xmis % 2 == 1) {
            ans += 2; 
        }
        
        return ans;
    }
}