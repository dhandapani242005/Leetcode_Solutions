class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int out[] = new int[n];
        int k=0;
        float ans= 0;
        for (int i=0; i<nums1.length; i++){
            out[k] = nums1[i];
            k++;
        }
        for (int i=0; i<nums2.length; i++){
            out[k] = nums2[i];
            k++;
        }
        float a = 2;
        Arrays.sort(out);
        if (n%2==0) {
            ans  = ( out[n/2] + out[(n-2)/2] ) / a ;
        }
        else{
            ans = out[n/2];
        }
        return ans;
    }
}