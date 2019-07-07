public class pattern31 {
    public static void main(String[] args){
        int n=5;
        int nst =5;
        int row=1;
        while(row<=n){
            int val =5;

            for(int cst =1; cst<=nst; cst++){
                if(cst + row ==n+1){
                    System.out.print("*");
                }else{
                    System.out.print(val);

                }
                val--;
            }
            System.out.println();
            row++;

        }
    }
}
