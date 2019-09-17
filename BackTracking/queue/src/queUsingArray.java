public class queUsingArray {   // circular queue
    private int[] data;
    private int size;
    private int front;

    public static final int DEFAULT_CAPACITY = 10;

    public queUsingArray() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public queUsingArray(int capacity) throws Exception{
        if(capacity < 1) throw new Exception("invalid size");
        this.data = new int[capacity];
        this.front = 0;
        this.size = 0;

    }

    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return  getSize()==0;
    }

    public void enQue(int val)throws Exception{
        if(this.getSize() == this.data.length){
            throw new Exception("Queue is full");
        }

        int ai = (this.front + this.size)%this.data.length;
        this.data[ai] = val;
        this.size++;

    }

    public int deQue()throws Exception{
        if(this.getSize()==0){
            throw new Exception("Que is empty");
        }

        int rv = this.data[this.front];

        this.data[this.front] = 0;
        this.front = (this.front + 1)%this.data.length;

        this.size --;
        return rv;
    }
    public int getFront()throws Exception{
        if(this.getSize()==0){
            throw new Exception("Que is empty");
        }

        int rv = this.data[this.front];


        return rv;
    }
    public void display(){
        for(int i=0; i<this.size; i++){
            int ai = (this.front + i)%this.data.length;
            System.out.print(this.data[ai] + "=>");
        }
        System.out.println("END");
    }
}
