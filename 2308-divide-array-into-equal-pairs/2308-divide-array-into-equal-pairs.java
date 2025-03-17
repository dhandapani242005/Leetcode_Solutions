class Solution {
    public boolean divideArray(int[] arr) {
        int count =1;
        Arrays.sort(arr);
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1] == arr[i]){
                count++;
            }
            else {
                if (count%2!=0){
                    return false;
                }
                count =1;
            }
        }
        return true;
    }
}