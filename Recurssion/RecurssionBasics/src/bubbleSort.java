public class bubbleSort {
    public static void main(String[] args){

        int[] arr = { 50,40,5,11,30,20,10};

       BubbleRec(arr, 0, arr.length -1);

      display(arr);
    }
    public static void BubbleRec(int[] arr, int si, int li){

        if(li==0){

            return ;

        }
        if(si==li){
            BubbleRec(arr, 0, li-1);
            return ;
        }

        if(arr[si] > arr[si+1]){
            int temp = arr[si];
            arr[si] = arr[si+1];
            arr[si] = temp;
        }
        BubbleRec(arr, si+1, li);


        return ;


    }

    public static void display(int[] arr){
        for (int i = 0; i <arr.length ; i++) {

            System.out.print( arr[i] + " ");
        }
    }
}
