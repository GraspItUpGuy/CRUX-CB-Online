public class Rotate90degree {
    public static void main(String[] args){

        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Orignal Array");
        for(int i=0; i<arr.length;i++){
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

       int[][] Rarr = new int[arr[0].length][arr.length];
        System.out.println("Array after Rotation ");
        int m=0;
        int n=0;
        for(int i=Rarr[0].length-1;i>=0;i--){
            for(int j=0;j<Rarr.length;j++){
                Rarr[m][n] = arr[j][i];
                n++;
            }
            m++;
            n=0;
        }
        for(int i=0; i<Rarr.length;i++){
            for (int j = 0; j <Rarr[0].length ; j++) {
                System.out.print(Rarr[i][j] + " ");
            }
            System.out.println();
        }





    }
}
