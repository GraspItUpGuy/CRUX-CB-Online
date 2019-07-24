public class LUbound {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,2,2,3,3,3,3,3,4,4,5,5,5,5,5,6,6,6};
        int bound = 6;
        int lower =0;
                int Upper =0;
        for(int i=0; i<arr.length -1;i++){

            if(arr[i]!=bound && arr[i+1]==bound){
                lower = i+1;
                System.out.println("Lower bound is " + lower);
            }else if(arr[i]==bound && arr[i+1]!=bound){
                Upper = i;
                System.out.println("Upper bound is " + Upper);
            }

        }

        if(lower ==0 || Upper==0){

            System.out.println("Not Found" );
        }
    }
}
