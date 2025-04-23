class Solution {
    public int largestPerimeter(int[] arr) {
        int a = arr.length;
        if (a<3) return 0;
        Arrays.sort(arr);
        int out = 0;
        while (out == 0 && a>=3){
            if (arr[a-1] < (arr[a-2] + arr[a-3]) ){
                out = (arr[a-1] + arr[a-2] + arr[a-3]);
            }
        a--;
        }
        return out;
    }
}