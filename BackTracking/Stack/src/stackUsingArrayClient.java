public class stackUsingArrayClient {
    public static void main(String[] args) throws Exception{
        stackUsingArray stack = new stackUsingArray(5);

//        stack.push(10);;
//        stack.display();
        for (int i = 1; i <=5 ; i++) {
            stack.push(i*10);
            stack.display();
            System.out.println(stack.top());
        }
       // stack.push(60);
      while(!stack.isEmpty()) { stack.pop();
        stack.display();
        System.out.println(stack.top());}
    }
}


// complexity is O(1)
///  used in browsers when we view previors or forward visited pages