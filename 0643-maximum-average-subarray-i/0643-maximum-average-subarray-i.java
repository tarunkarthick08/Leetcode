class Solution {
    public double findMaxAverage(int[] nums, int k) {
		int win_sum=0;
		for(int i=0;i<k;i++) {
			win_sum+=nums[i];
		}
		int max_sum=win_sum;
		for(int i=k;i<nums.length;i++) {
			win_sum+=nums[i]-nums[i-k];
			max_sum=Math.max(max_sum, win_sum);
		}
        return (double) max_sum/k;
        
    }

}