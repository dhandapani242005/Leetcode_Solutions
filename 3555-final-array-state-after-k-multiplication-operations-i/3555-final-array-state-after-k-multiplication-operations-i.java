class Solution {
    public int[] getFinalState(int[]arr, int n, int m) {
        int temp[] = new int [arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        while (n!=0){
            Arrays.sort(temp);
            for (int i=0; i<arr.length; i++){
                if (temp[0] == arr[i]){
                    temp[0] = temp[0] * m; 
                    arr[i] = arr[i] * m;
                    break;
                }
            }
            n--;
        }
        return arr;
    }
}