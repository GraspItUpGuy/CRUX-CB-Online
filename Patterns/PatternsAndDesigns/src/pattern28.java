public class pattern28 {
    public static void main(String[] args){
        int n=5;

        int nst = 1;
         int nsp = n-1;

         int row=1;
         while(row<=n){
             int val = row;
             // spaces
             for(int csp =1; csp<=nsp; csp++){
                 System.out.print(" ");
             }
             //stars
             int cst;
             for(cst =1; cst<=nst; cst++){
                 System.out.print(val);
                 if(cst<=nst/2){
                     val++;
                 }else{
                     val--;
                 }
             }

             System.out.println();


             row++;
             nst+=2;
             nsp--;

         }
    }
}
