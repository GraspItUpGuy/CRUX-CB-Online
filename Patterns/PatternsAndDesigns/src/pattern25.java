public class pattern25 {
    public static void main(String[] args){


        int n=5;

        int nst=1;
        int nsp =n-1;
        int print =1;
        int row =1;
        while(row<=n){

            // spaces
            for(int csp= 1; csp<=nsp; csp++){
                System.out.print("   ");
            }
            // stars
            for(int cst= 1; cst<= nst; cst++){
                System.out.print(" " + print + " " );
                print ++;
            }

            System.out.println();
            row ++;
            nsp--;
            nst+=2;
        }
    }
}
