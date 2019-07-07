public class pattern15 {
    public static void main(String[] args){
        int n=5;

        int nsp = 0;
        int nst = 5;

        int row=1;
        while(row<= 2*n-1){
            // spaces
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            // stars
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }

            System.out.println();

            if(row<n){
                nst--;
                nsp+=2;
            }else{
                nsp-=2;
                nst++;
            }

            row++;

        }
    }
}
