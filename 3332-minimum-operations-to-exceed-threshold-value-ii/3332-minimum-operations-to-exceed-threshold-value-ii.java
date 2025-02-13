class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        int count = 0;
        for(int i : nums)
        {
            if(i < k)
                queue.add(i);
        }
        while(! queue.isEmpty())
        {
            int num1 = queue.poll();
            if(queue.isEmpty()) 
            {
                count++;
                break;
            }
            int num2 = queue.poll();
            int num = (num1 * 2) + num2;
             count++;
            if(0 < num && num < k)
                queue.add(num);
        }
        return count ;
    }
}