import java.util.Scanner;

public class MAXinArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = input.nextInt();
        int[] arr = new int[n];
        // we need to find largest element of array
        for(int i=0; i<n; i++){
            System.out.println("enter element no " + i+1 + ": ");
            arr[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("largest element is " + max);



    }
}
