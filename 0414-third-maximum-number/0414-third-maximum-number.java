class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i : nums )
        {
            h.add(i);
        }
        int[] arr = new int[h.size()];
        int k=0;
        for(int i : h)
        {
            arr[k] = i;
            k++;
        }
        Arrays.sort(arr);

        if(arr.length<3)
        {
            return arr[arr.length-1];
        }
        return arr[arr.length-3];

        
    }
}