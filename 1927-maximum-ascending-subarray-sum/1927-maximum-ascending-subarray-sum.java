class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum = nums[n-1] ;
        int out = sum ;


        for (int i=n-1;i>0;i--){
            int j=i-1;
            if(nums[i] > nums[j]){
                out = out + nums[j];
            }
            else {
                 out = nums[j];
            }
                if(sum <out){
                    sum = out;
                
            }
        }
        return sum;
    }
}