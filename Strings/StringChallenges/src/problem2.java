import java.util.Scanner;
public class problem2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        char[][] arr = { {'.', '.', '*', '.'}, {'.', '#', '.', '.'}, {'*', '*', '.', '.'}, {'.', '#', '*', '*'} };


        int k = 5;


        int s = 6;


        for(int i=0; i<arr.length;i++){
           if(k>=5){
               for (int j = 0; j <arr[0].length ; j++) {
                   if(arr[i][j] == '.' ){
                       s = s-2;
                       System.out.println("power -2");
                   }else if(arr[i][j] == '*' ){
                       s = s+5;
                       System.out.println("power + 5");
                   }else if(arr[i][j] == '#' ){

                       System.out.println("blocked");
                       break;
                   }
               }
           }else{
               System.out.println("Not enough power");
               break;
           }

        }

        System.out.println("power left is" + s);






    }
}
