import java.util.Scanner;

public class twoDarray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
       int[][] array = new int[3][3];
        System.out.println(array[0][0]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = i+j;
            }
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        };


    }
}
