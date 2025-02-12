class Solution {
    public boolean containsDuplicate(int[] arr) {
        int count=0;
        int n = arr.length-1;
       Arrays.sort(arr);
       for (int i=0; i<n; i++){
        if (arr[i] == arr[i+1]){
            count ++;
        }
       } 
       return (count!=0);
    }
}