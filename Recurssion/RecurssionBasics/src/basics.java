public class basics {
    public static void main(String[] args){
       // PrintDec(5);

       // PI(5);
       // printDI(5);
        PDIskip(5);
    }

    public static void PrintDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintDec(n-1);
        // doing work while building of the stack
    }

    // doing work while destroying the stack
    public static void PI(int n){

        if(n==0){
            return;
        }
       PI(n-1);
        System.out.println(n);
    }

    public static void printDI(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        printDI(n-1);
        System.out.println(n);
    }

    public static void PDIskip(int n){

        if(n<=0){
            return;
        }

       if(n%2!=0){
           System.out.println(n);
       }
        PDIskip(n-1);

        if(n%2==0){
            System.out.println(n);
        }

    }

}
