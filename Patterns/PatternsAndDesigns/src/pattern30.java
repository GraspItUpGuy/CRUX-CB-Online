public class pattern30 {
    public static void main(String[] args){
        int n=5;

        int nst=5;
        int row =1;
        while(row<=n){

            int val =5;
            // stars
            for(int cst =1; cst<=nst; cst++){
                System.out.print(val);
                val--;
            }
            System.out.println();



            row++;
        }
    }
}
