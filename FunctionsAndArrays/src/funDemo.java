public class funDemo {
    public static void main(String[] args){

        System.out.println(addition(10,20));
        System.out.println(addition((int)10.5,(int)20.7));// typecasted here
    }

    public static int addition(int a, int b){
        return a+b;
    }
}
