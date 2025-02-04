class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0, currentDepth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        
        return maxDepth;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1")); // Output: 3
        //System.out.println(solution.maxDepth("(1)+((2))+(((3)))")); // Output: 3
    }
}
