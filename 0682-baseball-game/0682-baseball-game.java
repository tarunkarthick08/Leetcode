class Solution {
    public int calPoints(String[] os) {
       Stack<Integer> s= new Stack<>();
       for(String st:os){
        if(st.equals("C")){
            s.pop();
        }
        else if(st.equals("D")){
            s.push(s.peek()*2);
        }
        else if(st.equals("+")){
            int a = s.pop();
            int b = s.peek();
    
            s.push(a);
            s.push(a+b);
        }
        else{
            s.push(Integer.parseInt(st));
        }

       } 
       int sum=0;
       while(!s.isEmpty()){
        sum+=s.pop();
       }
       return sum;
    }
}