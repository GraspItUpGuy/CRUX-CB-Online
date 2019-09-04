public class Last_Index {
    public static void main(String[] args){

//        int[] arr = {15,17,19,3,15,61,15,61,17};
//        System.out.println(LastIndex(arr,arr.length-1,15));
//        System.out.println(FirstIndex(arr,0,15));
        int[] arr = new int[-1];


    }
    public static int LastIndex(int[] arr, int li, int data){

        if(li <=0 ){
            return -1;
        }

        if(arr[li] == data){
            return li;
        }else{
           int ans =  LastIndex(arr, li-1, data);
           return ans;
        }

    }
    public static int FirstIndex(int[] arr, int si, int data){

        if(si == arr.length){
            return -1;
        }
        if(arr[si] == data){
            return si;
        }else{
            int ans = FirstIndex(arr,si+1, data);
            return ans;
        }
    }
}
