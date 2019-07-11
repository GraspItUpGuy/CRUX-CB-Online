public class SelectionSort {
    public static void main(String[] args){

        int[] array = { 31, 17, 47, 76, 6, 29,0, 19, 85};
        System.out.print("Unsorted array\n");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ",");
        }

        SelectionSort(array);

        System.out.print("\nSorted array is \n");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + ",");
        }
    }

    public static void SelectionSort(int[] arr){
        for(int counter =0; counter<arr.length -1;counter++){
            int min = counter;
            for(int j = counter+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[counter];
                arr[counter] = temp;

            }
        }
    }
}
