class Solution {
    public int[] sortArrayByParity(int[] n) {
        int r[] = new int [n.length];
        int j=0;
      for(int i=0;i<n.length;i++){
        if(n[i]%2==0){
            r[j]=n[i];
            j++;
        }
      }
      for(int i=0;i<n.length;i++){
        if(n[i]%2!=0){
            r[j]=n[i];
            j++;
        }
      }

      
      return r;
    }
}