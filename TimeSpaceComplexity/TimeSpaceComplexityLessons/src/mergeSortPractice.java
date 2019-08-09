public class mergeSortPractice {
    public static void main(String[] args){

//           int[] arr1 = {10,20,30,40,50};
//           int[] arr2 = {5,15,30,45,60,70,80};
//           int[] ans = Merge2SortedArray(arr1,arr2);
//           display(ans);

        int[] arr = {5,15,30,45,60,70,80,10,20,30,40,50};
        int[] sorted = mergeSort(arr,0,arr.length-1);
        display(sorted);

    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static int[] Merge2SortedArray(int[] arr1, int[] arr2){
        int size = arr1.length + arr2.length;
        int[] ans = new int[size];
        int i=0;
        int j=0;
        int k =0;

        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else if(arr2[j]< arr1[i]){
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i == arr1.length){
            while(j<arr2.length){
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }else if(j == arr2.length){
            while(i<arr1.length){
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }

        return ans;


    }
   public static int[] mergeSort(int[] arr, int lo, int hi) {

        if(lo==hi){
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo + hi)/2;
        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid+1, hi);
        int[] merge = Merge2SortedArray(fh, sh);

        return merge;

   }


}
