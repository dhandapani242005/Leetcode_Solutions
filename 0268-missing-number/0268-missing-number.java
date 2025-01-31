class Solution {
    public int missingNumber(int[] arr) {

        int num=0;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    num=arr[j];
                    arr[j]=arr[i];
                    arr[i]=num;
                }
            }
        }

        for (int i=0; i<arr.length; i++){
           if(arr[i] != i){
            return i;
            }
            if(arr[arr.length-1] ==arr[i]){
                return i+1;
            }
        }
        return 0 ;
    }
}