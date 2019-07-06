public class pattern17 {
    public static void main(String[] args) {
        int n = 7; // rows
        int nst = n / 2; // stars
        int nsp = 1;    // spaces

        int row = 1;
        while (row <= n) {

            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(" * ");
            }
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("   ");
            }
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(" * ");
            }

            // prepration
            System.out.println();
            if(row <= n/2){
                nsp = nsp+2;
                nst = nst-1;
            }else {
                nsp = nsp-2;
                nst = nst +1;

            }

            row ++;


        }
    }

}

