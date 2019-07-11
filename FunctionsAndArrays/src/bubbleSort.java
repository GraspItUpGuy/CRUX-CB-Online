public class bubbleSort {
    public static void main(String args[]){
       int[] array = { 31, 17, 47, 76, 6, 29,0, 19, 85};
        System.out.print("Unsorted array\n");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ",");
        }

       bubbleSort(array);

        System.out.print("\nSorted array is \n");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ",");
        }



       
    }
    public static void bubbleSort(int[] arr){
        int temp;

        System.out.println("\nSee the steps");
        for(int counter =0; counter<arr.length -1; counter ++){
           for(int j=0; j<arr.length-1; j++){

               if(arr[j+1]< arr[j]){
                  temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j]  =temp;
               }

           }

           
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i] + ",");
            }
        }
    }



}
