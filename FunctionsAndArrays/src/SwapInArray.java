public class SwapInArray {
    public static void main(String[] args){
        int[] arr = { 4,5,6,7,8,9};
        for(int t=0; t<arr.length; t++ ){
            System.out.print(arr[t] + " ");
        }
        System.out.println();
        swap(arr, 1,2);
        System.out.println();
        for(int t=0; t<arr.length; t++ ){
            System.out.print(arr[t] + " ");
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
        for(int t=0; t<arr.length; t++ ){
            System.out.print(arr[t] + " ");
        }

    }
}
