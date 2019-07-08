import java.util.Scanner;

public class NatureOfRootsQE {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coefficient  of xˆ2  (0-100) : ");
        int a  = input.nextInt();

        System.out.println("Enter coefficient  of x (0-100) : ");
        int b  = input.nextInt();

        System.out.println("Enter constant (0-100) : ");
        int c  = input.nextInt();

        double d = Math.pow(b,2) - 4*a*c ;

        if(d>0){
            System.out.println("QE has real and distinct roots");
        }else if(d==0){
            System.out.println("QE has real and equal roots");
        }else if(d<0){
            System.out.println("QE has imaginary roots ");
        }else{
            System.out.println("something went wrong");
        }

    }
}
