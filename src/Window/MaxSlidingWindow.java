import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans = new int[n-k+1];
        int ri=0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i =0;i<nums.length;i++){
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                ans[ri++]=nums[q.peek()];
            }
        }
        return ans;
    }
    
}