public class pattern29 {
    public static void main(String[] args){


        int n=5;

        int nst=1;
        int nsp = n-1;

        int row=1;
        while(row<=n){
            int val = row;
            //space
            for (int csp =1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            //stars
            for (int cst =1; cst<=nst; cst++){
                if(cst == 1 || cst == nst){
                    System.out.print(val);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
            nst+=2;
            nsp--;
            row++;
        }

    }
}
