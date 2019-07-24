import java.util.Scanner;

public class KTHroot {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter n");
        double n = input.nextDouble();
        System.out.print("Enter k \n");
        double k =input.nextDouble();
        double x;
        for(x  = 1; x<n; x++){
            if(Math.pow(x,k) >=n){
                System.out.println(x);
            }
        }

    }
}
