public class pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int nst = 1;
        int nsp = n - 1;

        int row = 1;
        while (row <= n) {


            int valLeft = n-row+1;
            int valRight = 9;


            //spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("   ");
            }

            // stars
            for (int cst = 1; cst <= nst; cst++) {

                if (cst == row) {
                    System.out.print(" 0 ");
                } else if (cst < row) {

                    System.out.print( " " +valLeft + " " );
                    valLeft++;

                } else {
                    System.out.print(" " + valRight + " ");
                    valRight--;
                }

            }


            System.out.println();

            row++;
            nsp--;
            nst += 2;
        }

        }
    }

