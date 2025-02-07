class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> colorMap = new HashMap<>(); // color -> count
        HashMap<Integer, Integer> ballMap  = new HashMap<>();  // ball -> color
        int n = queries.length;
        int[] arr = new int[n]; // Result array
        int idx = 0; 
        
        for (int[] temp : queries) {
            int ball  = temp[0];
            int color = temp[1];

            // If ball is already colored, decrease count of the old color
            if (ballMap.containsKey(ball)) {  
                int oldColor = ballMap.get(ball);
                colorMap.put(oldColor, colorMap.get(oldColor) - 1);

                // Remove 
                if (colorMap.get(oldColor) == 0) {
                    colorMap.remove(oldColor);
                }
            }

            // Assign 
            ballMap.put(ball, color);
            colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);

            // Store 
            arr[idx++] = colorMap.size();
        }
        return arr;
    }
}