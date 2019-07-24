import java.util.Scanner;

public class SumOfTwoArrays {
    // my version => gives incorrect answer

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter size for 1st array");
        int size1 = input.nextInt();
        System.out.println("Enter size for 2nd array");
        int size2 = input.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter elements for 1st array");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter elements for 2st array");
        for(int i=0; i<arr2.length; i++){
            arr2[i] = input.nextInt();
        }

        int sum1 = 0;
        int a = arr1.length;
        int mul1=1;
        for (int i = 0; i <arr1.length ; i++) {
            mul1*=10;
        }
        for(int i= 0; i<arr1.length;i++){
            sum1+= arr1[i]*mul1 ;
            mul1/=10;
        }

        int sum2 = 0;
        int mul2 = 1;
        for (int i = 0; i <arr1.length ; i++) {
            mul2*=10;
        }
        for(int i= 0; i<arr2.length;i++){
            sum2+= arr2[i]*mul2 ;
            mul2/=10;
        }

        int finalSum = (sum1+ sum2)/10;
        System.out.println(finalSum);


    }
}
