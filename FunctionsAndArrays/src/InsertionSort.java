public class InsertionSort {
   public static void main(String[] args){
        int[] array = { 31, 17, 47, 76, 6, 29,0, 19, 85};
        System.out.print("Unsorted array\n");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ",");
        }

        InsertionSort(array);

        System.out.print("\nSorted array is \n");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ",");
        }
    }

    public static void InsertionSort(int[] arr ){
       for(int counter =1; counter<arr.length; counter++){
           for(int j=counter; j>0; j--){
               if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1]= temp;
               }
           }
       }
    }
}
