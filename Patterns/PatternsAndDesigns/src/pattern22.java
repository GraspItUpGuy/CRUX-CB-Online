public class pattern22 {
    public static void main(String[] args){
        int n=5;

        int nst =n;
        int nsp=0;
        int row=1;
        while(row<=n){
            // stars
            int cst;
            if(row ==1){
                cst =2;
            }else{
                cst=1;
            }
            for(; cst<=nst; cst++){
                System.out.print("*");
            }

            // spaces
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" ");
            }


            // stars
            for( cst=1; cst<=nst; cst++){
                System.out.print("*");
            }

            System.out.println();
            row++;
            nst--;
            nsp+=2;
        }


    }
}
