import java.util.ArrayList;

public class pattern {
    public static void main(String[] args){

        //pattern(7,1,1);
        //pattern2(7,1,1);

//        int[] arr = {5,4,3,2,1};
//        BubbleSort(arr,0, arr.length-1);
//        display(arr);
       // int[] arr = {3,8,1,8,8,4};
//        ArrayList<String> answer = getSubSequence("abc");
//        for (int i = 0; i <answer.size() ; i++) {
//            System.out.print(answer.get(i) + " ");
//        }

        ArrayList<String> answer = subSeqPrac("abc");
        for (int i = 0; i <answer.size() ; i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
    public static void pattern(int n , int row, int col){

        if(row > n ){
            return;
        }
        if (col>row){
            System.out.println();
            pattern(n, row+1, 1);
            return;
        }
        System.out.print("*");
        pattern(n,row,col+1);
    }
    public static void pattern2(int n, int row, int col){

        if(row > n){
            return;
        }

        if(row + col > n){
            System.out.println();
            pattern2(n,row+1, 1);
            return;
        }

        System.out.print("*");
        pattern2(n,row,col + 1);

    }
    public static void BubbleSort(int[] arr, int si, int li){

        if(li==0){
            return;
        }

        if(si == li){
            BubbleSort(arr,0,li-1);
            return;
        }
        if(arr[si] > arr[si +1]){
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }
        BubbleSort(arr,si+1, li);

    }

    public static ArrayList<String> getSubSequence(String str){
       if(str.length()==0){
           ArrayList<String> baseResult = new ArrayList<>();
           baseResult.add("");
           return baseResult;

       }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList();
        ArrayList<String> recResult = getSubSequence(ros);
        for (int i = 0; i <recResult.size() ; i++) {
           ArrayList<String> base = new ArrayList<>();
           base.add("");
           return  base;
        }
        return myResult;
    }

    public static ArrayList<String> subSeqPrac(String str){
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return  base;

        }

        char cc = str.charAt(0);
        String subStr = str.substring(1);
        ArrayList<String> myresult = new ArrayList<>();
        ArrayList<String> recREsult = subSeqPrac(subStr);
        for(int i=0; i<recREsult.size();i++){
            myresult.add(myresult.get(i));
            myresult.add(cc + myresult.get(i));
        }
        return myresult;
    }

   // public static ArrayList<String> permutationsOfString(String str){

   // }

}
