import java.util.Scanner;

public class ManMohan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int nst=1;
        int row=1;
        while(row<=n){
            for(int cst = 1; cst<=nst ;cst++){


                   if(row==1){
                       System.out.print(cst);
                   }
                   else {
                       if(cst ==1 || cst== row ){
                           System.out.print(row-1);
                       }else{
                           System.out.print("0");
                       }
                   }

            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
