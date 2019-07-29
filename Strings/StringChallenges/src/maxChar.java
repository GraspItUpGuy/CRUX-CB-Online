public class maxChar {
    public static void main(String[] args){

        int[] arr ={1,1,1,1,1,1,2,2,2,2,3,5,6,7,7,7,8,8,8};



        int max =1;
        int cur =1;
        int ans = arr[0] ;

        for(int i=0;i<arr.length-1;i++){
            System.out.println("in loop");
            if(arr[i+1] == arr[i]){
                cur++;
                ans = arr[i];
            }else if(cur > max){
                max = cur;
                ans = arr[i];
                cur =1;

            }

        }


        System.out.println("max : " + ans + " :" + max);
    }
}
