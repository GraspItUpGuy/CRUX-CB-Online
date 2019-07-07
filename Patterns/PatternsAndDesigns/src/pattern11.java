public class pattern11 {

        public static void main(String[] args){
            int n=5;

            int nsp = n-1;
            int nst =1;

            int row=1;
            while(row<=n){
                //spaces
                for(int csp =1; csp<=nsp; csp++){
                    System.out.print("   ");
                }
                // stars
                for(int cst = 1; cst<=nst; cst++){
                    if(cst %2 ==0){
                        System.out.print("   ");
                    }else{
                        System.out.print(" * ");
                    }
                }

                System.out.println();
                nsp--;
                nst+=2;
                row++;
            }
        }
    }


