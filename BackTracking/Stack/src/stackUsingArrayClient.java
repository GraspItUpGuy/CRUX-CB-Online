public class stackUsingArrayClient {

    public static void main(String[] args) throws Exception {

//        stackUsingArray s = new stackUsingArray(8);
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.push(40);
//        s.push(50);
//        s.push(60);
//        s.display();
//
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//
//        s.push(100);
//        s.push(200);
//        s.push(6300);
//        while(s.isEmpty() == true){
//            s.pop();
//            s.display();
//        }
//
//
//        s.display();
//
//    }

        stackUsingArray stack = new stackUsingArray();
        for (int i = 1; i <=5 ; i++) {
            stack.push(i*10);
            stack.display();
        }
        System.out.println();

//        System.out.println( stack.top());
//        System.out.println(stack.pop());
//        stack.display();
//        System.out.println(stack.top());


        while (!stack.isEmpty()){
            stack.display();
            stack.pop();
        }

        stack.display();

    }

}
