import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner input  =  new Scanner(System.in);
        int n=6;

        int nst=1;
        int row=1;
        while(row<=n){
            for(int cst =1; cst<=nst; cst++){
               if( row >2 && row%2==0 && cst!=1 && cst!=row){
                   System.out.print("0");
               }else{
                   System.out.print("1");
               }
            }

            System.out.println();
            row++;
            nst++;
        }
    }
}
