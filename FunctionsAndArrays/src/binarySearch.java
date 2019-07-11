public class binarySearch {
    public static void main(String[] args){
        // arrary must be sorted either in increasing or in decreasing
        // number of comparisons made using binary search is logN base 2
        // whereas in linear learch N comparisons are made

        int[] arr = {1,6,8,9,14,17,27,32,35,37,42,44,49,51,55};
        birnarySearch(arr, 42);
    }
    public static int birnarySearch(int[] arr, int item){
        int low = 0;
        int high = arr.length -1;
        int found =-1;
         while(low <= high){
             int mid = (low + high)/2;

             if(arr[mid]< item){
                 low = mid+1;

             }else if(arr[mid] > item){
                 high = mid-1;
             } else if(arr[mid] == item){
                 found =mid +1;
                 System.out.println("element found at " + found);

                 return mid;

             }
             }


         if(found ==-1){
             System.out.println("not  found");
         }
         return found;

         }


    }

