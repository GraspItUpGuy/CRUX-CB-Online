public class pattern21 {
    public static void main(String[] args){

        int n=5;

        int nst =1;
        int nsp = 2*n -3;

        int row = 1;
        while(row<=n){
            //stars
            for(int cst = 1; cst<=nst; cst ++){
                System.out.print(" * ");
            }
            // spaces
            for(int csp =1; csp<= nsp; csp++){
                System.out.print("   ");
            }

            int cst = 1;   // handling extra star in last row
                    if(row ==n){
                        cst =2;
                    }
            //stars
            for(; cst<=nst; cst ++){
                System.out.print(" * ");
            }

            // preparation
            System.out.println();
            nst++;
            nsp-=2;
            row ++;




        }


    }
}
