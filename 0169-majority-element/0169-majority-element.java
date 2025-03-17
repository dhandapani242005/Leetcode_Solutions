class Solution {
    public int majorityElement(int[]arr) {
        int max=1;
        int temp=1;
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}