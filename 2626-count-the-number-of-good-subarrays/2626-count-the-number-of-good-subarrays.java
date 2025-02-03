class Solution {
    public long countGood(int[] nums, int k) {
        int j = 0;  
        int pairs = 0, n = nums.length; 
        long count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0;i<n;i++){
            freq.merge(nums[i], 1, Integer::sum);
            pairs += freq.get(nums[i]) - 1;

            while(pairs >= k){
                count += n - i;
                pairs -= freq.get(nums[j]) - 1;
                freq.merge(nums[j], -1, Integer::sum);
                j++;
            }
        }
        return count;
    }
}