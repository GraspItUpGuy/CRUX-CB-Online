public class pattern20 {
    public static void main(String[] args){
        int n=7;
        int nst =1;
        int nsp = (n-1)/2;
        int nsp2 = 1;

        int row=1;
        while(row<=n){
            // space1
            for(int csp =1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            // stars 1
            for(int cst =1;  cst<=nst; cst++){
                System.out.print("*");
            }
            // space2
            for(int csp=2; csp<=nsp2; csp++){
                System.out.print(" ");
            }

            int cst2;
            if(row==1 || row==n){
                cst2 = 2;
            }else{
                cst2 =1;
            }
            // stars
            for(;  cst2<=nst; cst2++){
                System.out.print("*");
            }

            System.out.println();
            row++;
            if(row<=n/2 +1){
                nsp--;
            }else{
                nsp++;
            }

            if(row<=n/2+1){
                nsp2+=2;
            }else{
                nsp2-=2;
            }

        }
    }
}
