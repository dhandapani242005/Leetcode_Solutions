class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1+n2;
        double c=0;
        int arr3[] = new int [n3];
        for (int i=0; i<n1; i++){
            arr3[i]=arr1[i];
        }
        for (int i=0; i<n2; i++){
            arr3[i+n1] = arr2[i];
        }
        Arrays.sort(arr3);
        if(n3%2==0){
            double a = arr3[n3/2];
            double b = arr3[ (n3/2) - 1];
            c= (a+b)/2;
        }
        else {
            c = arr3[n3/2];
        }
        return c;
    }
}