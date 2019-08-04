public class factorial {
    public static void main(String[] args){

       int fact =  fact(5);
        System.out.println(fact);
    }
    public static int  fact(int n){
        if(n==1){
            return 1;
        }

        int factorial  =  n * fact(n-1);


        return factorial;

    }
}
