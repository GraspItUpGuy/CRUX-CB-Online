public class isArraySorted {
    public static void main(String[] args){
        int[] arr = {1,3,7,8,9,};

        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr, int si){

        if (si == arr.length-1){
            return true;
        }
        if(arr[si] > arr[si+1]){
            return false;
        }else{
            boolean answer =  isSorted(arr, si+1);
            return answer;
        }
    }
}
