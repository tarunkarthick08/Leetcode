class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length-k;
        int j=0;
        int arr[] = new int [nums.length]; 
        for(int i=n;i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int m=0;m<n;m++){
            arr[j]=nums[m];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
        
    }
