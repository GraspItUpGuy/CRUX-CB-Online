import java.util.Scanner;

public class tripletSum {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] arrUnsorted = { 7,2,5,9,14,28,32,4,30,20};
        int[] arrSorted = sort(arrUnsorted);


        System.out.println("Enter target sum");
        int target = input.nextInt();
        for(int i=0; i< arrSorted.length;i++ ){
            for (int j = 1; j < arrSorted.length; j++) {
                for (int k = 02; k < arrSorted.length; k++) {
                    if(arrSorted[i] + arrSorted[j] + arrSorted[k] == target){
                        System.out.print(arrSorted[i] + "," + arrSorted[j] + "and" + arrSorted[k] + "\n" );
                    }
                }
            }
        }
    }

    public static int[] sort(int[] arr){
       for(int counter =0; counter<arr.length -1; counter++ ){
           for(int j=0; j< arr.length - 1- counter; j++){
               if(arr[j+1] < arr[j]){
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
           }
       }
       return arr;
    }

//    public static void display(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }


}
