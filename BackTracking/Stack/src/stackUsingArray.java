public class stackUsingArray {
//    protected int[] data;
//    protected int tos;
//
//    public stackUsingArray() {
//        data = new int[5];
//        tos = -1;
//    }
//
//    public stackUsingArray(int cap) {
//        data = new int[cap];
//        tos = -1;
//    }
//
//    public void push(int item) throws Exception {
//
//        if (isFull()) {
//            throw new Exception("Stack is Full.");
//        }
//
//        tos++;
//        data[tos] = item;
//    }
//
//    public int pop() throws Exception {
//
//        if (isEmpty()) {
//            throw new Exception("Stack is Empty.");
//        }
//
//        int temp = data[tos];
//        data[tos] = 0;
//        tos--;
//        return temp;
//    }
//
//    public int peek() throws Exception {
//
//        if (isEmpty()) {
//            throw new Exception("Stack is Empty.");
//        }
//
//        int temp = data[tos];
//        return temp;
//    }
//
//    public int size() {
//        return tos + 1;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public boolean isFull() {
//        return size() == data.length;
//    }
//
//    public void display() {
//
//        System.out.println("-------------------");
//
//        for (int i = tos; i >= 0; i--) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println("\n-------------------");
//    }

    private int data[] ;
    private int top;

    public  stackUsingArray(){
        this.data = new int[5];
        this.top = -1;
    }
    public  stackUsingArray(int capacity)throws Exception{
        if(capacity < 1){
            throw new Exception("capacity can't be less than 1 ");
        }else {
            this.data = new int[capacity];
            this.top = -1;
        }
    }
    public int size(){
        return this.top +1 ;
    }
    public boolean isEmpty(){
        return (this.size() == 0);
    }
    public void push(int value) throws Exception{
        if(this.size() == this.data.length){
            throw new Exception("Stack is full");
        }
        this.top ++;
        this.data[this.top] = value;

    }

    public int pop()throws Exception{
        if(this.size()==0){
            throw new Exception("stack is empty");
        }
        int rv = this.data[this.top];
        this.data[this.top] = 0;
        this.top --;
        return rv;
    }

    public int top()throws Exception{
        if(this.size()==0){
            throw new Exception("stack is empty");
        }
        int rv = this.data[this.top];
        return rv;
    }

    public void display(){
        for(int i = this.top; i>=0; i--){
            System.out.print(this.data[i] + ",");
        }
        System.out.println("end");
    }


}
