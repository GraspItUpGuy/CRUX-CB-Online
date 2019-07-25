import java.util.Scanner;

public class Problem1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a character");
        char inp = input.next().charAt(0);
        int ascii = (int)inp;
        if(ascii>=44 && ascii<=69){
            System.out.println("UPPERCASE");
        }else if(ascii >= 97 && ascii<= 122){
            System.out.println("LOWERCASE");
        }else{
            System.out.println("INVALID");
        }
    }
}
