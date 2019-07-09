import java.util.Scanner;

public class LinearSearch {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter size of array");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("enter element no " + i + ": ");
            arr[i] = input.nextInt();
        }


        System.out.println("enter element you want to be searched");
        int findThis = input.nextInt();
        int found =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==findThis){
                found=1;
                System.out.println("Element found at position " + i);
            }
        }

        if(found ==0){
            System.out.println("Element not found in  the array");
        }
    }
}

