import java.util.Scanner;

public class arrayOperations {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int[] arr =  takeInput();
        System.out.println("input is taken \n now displaying your array");
        display(arr);

    }
    public static int[]   takeInput(){
        System.out.println("Size???");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter element at index " + i+1 +" :");
            arr[i] = input.nextInt();

        }
        return arr;

    }

    public static void display(int[] array ){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
