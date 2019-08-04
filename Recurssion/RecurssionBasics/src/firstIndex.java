public class firstIndex {
    public static void main(String[] args){

        int[] arr = {6,8,1,1,8,3,4};
     //   System.out.println(FirstIndex(arr, 0 , 3));

        int si = arr.length-1;
        System.out.println(LastIndex(arr, si, 8));
    }
    public static int FirstIndex(int[] arr, int si, int data){
        if(si == arr.length){
            return -1;
        }

        if(arr[si] == data){
            return si;
        }else{
            int answer = FirstIndex(arr, si + 1, data);
            return answer;
        }
    }

    public static int LastIndex(int[] arr, int si , int data){

        if(si == 0){
            return -1;
        }

        if(arr[si] == data){
            return si;
        }else{
            int answer =  LastIndex(arr, si-1, data);
            return answer;
        }

    }
}
