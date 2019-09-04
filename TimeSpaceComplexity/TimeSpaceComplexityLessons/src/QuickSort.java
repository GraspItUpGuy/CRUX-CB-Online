public class QuickSort {
    public static void main(String[] args){

        int[] arr = {20,10,30,50,60,5,80,25};
        quickSort(arr,0,arr.length-1);

    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
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

        display(arr);
    }

}
