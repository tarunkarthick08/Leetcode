class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean n=false;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                 n=true;
            }

        }
        return n;
    }
}