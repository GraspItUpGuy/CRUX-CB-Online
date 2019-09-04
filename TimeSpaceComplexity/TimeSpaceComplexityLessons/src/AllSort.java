import java.nio.channels.SelectableChannel;

public class AllSort {

        public static void main(String[] args){
           // int[] USarr = {9,8,7,6,5,4,3,2,1};
           // System.out.println("Unsorted Array");
            //display(USarr);
            //BubbleSort(USarr);
           // SelectionSort(USarr);
          // InsertionSort(USarr);
//           int[] arr1 = {10,20,30,40,50};
//           int[] arr2 = {5,15,30,45,60,70,80};
//           int[] ans = Merge2SortedArray(arr1,arr2);
//           display(ans);

            int[] arr = {20,10,30,50,60,5,80,25};
//            int[] Sarr = MergeSort(arr, 0, arr.length-1);
//            display(Sarr);

//            quickSort(arr,0,arr.length-1);
//            display(arr);





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

        public static int[] Merge2SortedArray(int[] arr1, int[] arr2){
            int[] mergedArray = new int[arr1.length + arr2.length];
            int i =0;
            int j=0;
            int k =0;

            while(i<arr1.length && j<arr2.length){
                if(arr1[i]<=arr2[j]){
                    mergedArray[k] =arr1[i];
                    i++;
                    k++;
                }else if(arr2[j] < arr1[i]){
                    mergedArray[k] = arr2[j];
                    j++;
                    k++;
                }
            }
            if(i == arr1.length) {
                while (j < arr2.length) {
                    mergedArray[k] = arr2[j];
                    j++;
                    k++;
                }
            }else if(j == arr2.length){
                    while(i<arr1.length){
                        mergedArray[k] =  arr1[i];
                        i++;
                        k++;
                    }
                }


            return mergedArray;
        }

        public static int[] MergeSort(int[] arr, int lo, int hi){
            if(lo==hi){
                int[] br = new int[1];
                br[0] = arr[lo];
                return br;
            }
            int mid = (lo+hi)/2;
           int[] fh = MergeSort(arr, lo, mid);
           int[] sh =  MergeSort(arr,mid+1,hi );
           int[] merge = Merge2SortedArray(fh, sh);
           return merge;
        }

        public static void quickSort(int[] arr, int lo, int hi){

            if(lo >= hi){
                 return;
            }
            // 1 . partitioning
            int mid = (lo + hi)/2;
            int pivot = arr[mid];
            int left = lo;
            int right = hi;
            while(left == right){
                while(arr[left] < pivot){
                    left ++;
                }
                while(arr[right] > pivot){
                    right --;

                }

               if(left<=right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right++;

                }

               //smaller problem
                quickSort(arr, lo,right);
               quickSort(arr, left,  hi);

            }
        }

    }


