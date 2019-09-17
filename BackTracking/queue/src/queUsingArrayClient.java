public class queUsingArrayClient {
    public static void main(String[] args) throws Exception{

        queUsingArray que  = new queUsingArray(5);
        for (int i = 1; i <= 5; i++) {
            que.enQue(i*10);
            System.out.println(que.getFront());
            que.display();
        }

        System.out.println("**********");
        System.out.println(que.deQue());
        que.display();
        System.out.println(que.getFront());
    }
}
