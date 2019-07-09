import java.util.Scanner;

public class reverseArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        char[] arr = {'p','u','n', 'e', 'e', 't', ' ', 'k','u','m', 'a', 'r'};
        char[] rev = new char[arr.length];

        int i=0;
        int j=rev.length;
        while(i< arr.length && j>0){
            arr[j] = arr[i];

            j--;
            i++;
        }

        System.out.println("New array is \n");
        for(int k=0; i<rev.length; k++){
            System.out.print(rev[k] + " ");
        }

    }
}
