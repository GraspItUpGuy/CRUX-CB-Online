public class pattern {
    public static void main(String[] args){

        pattern(5,1,1);
    }
    public static void pattern(int n , int row, int col){

        if(col > row ){
            System.out.println();
            pattern(n, row+1, 1);
            return;
        }
        System.out.print("*");
        pattern(n,1,col+1);
    }
}
