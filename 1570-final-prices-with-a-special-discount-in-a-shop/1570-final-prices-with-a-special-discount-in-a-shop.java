class Solution {
    public int[] finalPrices(int[] arr) {
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] >= arr[j]){
                    arr[i] -= arr[j];
                    break;
                }
            }
        }
        return arr;
        
    }
}