import java.lang.ref.SoftReference;

public class AllSortPractice {
    public static void main(String[] args){

        int[] array = { 31, 17, 47, 76, 6, 29,0, 19, 85};
        System.out.print("Unsorted array\n");
       display(array);
       bubbleSort(array);
//       SelectionSort(array);
//      InsetionSort(array);
    }

    public static void bubbleSort(int[] arr){

        for(int counter =0; counter<arr.length-1; counter++){
            for(int j=0; j<arr.length -1 - counter; j++){
                if(arr[j+1] < arr[j]){
                    Swap(arr[j+1],arr[j]);
                }
            }
        }
        System.out.println("\nSorted array using Bubble Sort\n");
        display(arr);
    }
    public static void SelectionSort(int[] arr){

        for(int counter =0; counter<arr.length-1; counter++){
            int min = counter;
            for(int j=1; j<arr.length; j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
                Swap(arr[min], arr[counter]);
            }
        }
        System.out.println("\nSorted array using Selection Sort\n");
        display(arr);
    }
    public static void InsetionSort(int[] arr){

        for(int counter =1; counter<arr.length; counter++){
            for(int j=counter; j>0; j--){
                if(arr[j]<arr[j-1]){
                    Swap(arr[j],arr[j-1]);
                }
            }
        }
        System.out.println("\nSorted array using Insertion Sort\n");
        display(arr);
    }

    public static void Swap(int a, int b){
        int temp;
        temp = a;
        a=b;

    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }
}
