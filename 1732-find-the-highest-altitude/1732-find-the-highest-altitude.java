class Solution {
    public int largestAltitude(int[] gain) {
        int[] a=new int[gain.length+1];
        a[0]=0;
        int j=0;
        int max=0;
        for(int i=1;i<a.length;i++){
            a[i]=gain[j];
            j++;
        }
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
