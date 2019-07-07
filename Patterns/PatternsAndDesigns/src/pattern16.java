public class pattern16 {
    public static void main(String[] args){
        int n=5;

        int nsp = n-1;
        int nst = n;

        int row =1;
        while (row<= 2*n-1){
            // space
            for(int csp =1; csp<= nsp; csp++){
                System.out.print(" ");
            }
            // stars

                for(int cst = 1; cst<=nst ; cst++){
                    System.out.print("*");
                }
                System.out.println();

                if(row<n){
                    nsp--;
                    nst--;
                }else{
                    nsp++;
                    nst++;
                }

                row++;

        }
    }
}
