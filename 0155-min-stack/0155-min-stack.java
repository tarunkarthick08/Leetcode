class MinStack {
    int[] a=new int[1000000];
    int top =-1;

    public MinStack() {
        
    }
    
    public void push(int val) {
        top++;
        a[top]=val;
    }
    public void pop() {
        top--;
    }
    
    public int top() {
        return a[top];
    }
    
    public int getMin() {
        int min=a[0];
        for(int i=1;i<=top;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}
