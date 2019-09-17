public class stackUsingArray {    //  LIFO
    private int[] data;
    private int top;
       int size;

    public stackUsingArray() {
        this.size = 10;
    }

    public stackUsingArray(int capacity) throws Exception{
        if(capacity < 1){
            throw new Exception("invalid Capacity");
        }
        this.data = new int[capacity];
        this.size = capacity;
        this.top = -1;
    }

    public int getSize(){
        return this.top + 1 ;
    }

    public boolean isEmpty(){
        if(this.getSize() == 0){
            return true;
        }else{
            return false;
        }
    }

public void push(int val)throws Exception{
        if(this.getSize()== this.data.length){
            throw new Exception("Stack Overflow");
        }
        this.top++;
        this.data[this.top] = val;
}

public int pop()throws Exception{
        if(this.getSize() == 0){
            throw new Exception("Stack Empty");
        }
        int rv = this.data[this.top];
        this.data[this.top] = 0;
        this.top --;
        return rv;
}
 public int top()throws Exception{
        if(this.getSize()==0){
            throw new Exception("Stack is empty");
        }
     int rv = this.data[this.top];
        return rv;
 }
 public void display(){
     for (int i = this.top; i >=0 ; i--) {
         System.out.print(this.data[i] + "=>");
     }
     System.out.println("END");
 }


}
