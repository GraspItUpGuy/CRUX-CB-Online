public class pattern {
    public static void main(String[] args){
//        for n =5
//    *****
//   *   *
//  *   *
// *   *
//*****

        int n=5;

        int nsp2 =3;

        int nst=1;
        int nsp =n-1;

        int row=1;
        while(row<=n) {
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }

            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");
            }

            // spaces
            for (int csp = 1; csp <= nsp2; csp++) {
                if(row ==1 || row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            // stars
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*");
            }
            System.out.println();
            row++;
            nsp--;


        }
    }
}
