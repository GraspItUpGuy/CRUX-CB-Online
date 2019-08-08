import java.nio.channels.SelectableChannel;

public class AllSort {

        public static void main(String[] args){
            int[] USarr = {9,8,7,6,5,4,3,2,1};
            System.out.println("Unsorted Array");
            display(USarr);
            BubbleSort(USarr);
            SelectionSort(USarr);
           InsertionSort(USarr);





        }


        public static void display(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();
        }
        public static void BubbleSort(int[] arr){
            for (int counter = 0; counter < arr.length -1; counter++) {
                for (int j = 0; j < arr.length -1 - counter; j++) {
                    if(arr[j+1]< arr[j]){
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp;
                    }
                }

            }
            display(arr);
        }

        public static void SelectionSort(int[] arr){
            for (int counter = 0; counter < arr.length-1; counter++) {
                int min = counter;
                for (int j = 1; j < arr.length ; j++) {
                    if(arr[j]<arr[min]){
                        min = j;
                    }
                    int temp = arr[counter];
                    arr[counter] = arr[min];
                    arr[min] = temp;
                }
            }
            display(arr);
        }
        public static void InsertionSort(int[] arr){

            for (int counter = 1; counter < arr.length-1; counter++) {
                for(int  j = counter; j>0; j--){
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j-1];
                        arr[j-1] =arr[j];
                        arr[j] = temp;
                    }
                }
            }

            display(arr);
        }

    }


