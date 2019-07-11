public class targetProblem {
    public static void main(String[] args){
        int[] array = { 1,2,3,4,5,6,7,8,9,10};


        int target =17;
        int mid =  array.length/2;
        for(int i=0; i<=mid; i++){
            for(int j=array.length-1; j>mid; j--){
                if(array[i] + array[j] == target){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }

}
