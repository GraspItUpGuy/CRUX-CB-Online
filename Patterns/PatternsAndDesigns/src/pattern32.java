public class pattern32 {

    public static void main(String[] args){

        int nst =1;
        int n = 5;


        int nr = 2*n -1;

        int row =1;
        while(row<=nr){

            int val = row;
            // stars
            for(int cst =1 ;cst<=nst; cst++) {
                {
                    if (cst % 2 == 0) {
                        System.out.print("*");
                    } else if(row>n) {
                        System.out.print(nr - val +1);
                    }else{
                        System.out.print(val);
                    }
                }
            }
            System.out.println();

            if(row<= nr/2){
                nst+=2;
            }else{
                nst-=2;
            }
            row++;

        }
    }
}
