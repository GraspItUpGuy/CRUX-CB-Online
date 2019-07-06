import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args){

       int n=7;

       int nsp=3;
       int nst=1;

       int row=1;
       while(row <=n){

           // space
           for(int csp=1; csp<=nsp; csp++){
               System.out.print("   ");
           }

           // stars
           for(int cst=1; cst<=nst; cst++){
               System.out.print(" * ");
           }
           // space
           for(int csp=1; csp<=nsp; csp++){
               System.out.print("   ");
           }

           System.out.println();

           if(row <= n/2){
               nsp--;
               nst+=2;
           }else {
               nsp++;
               nst-=2;
           }


           row++;

       }
    }
}
