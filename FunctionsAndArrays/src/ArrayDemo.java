public class ArrayDemo {
    public static void main(String[] args){
        int[] arr = null;

        System.out.println(arr);

        arr = new int[5];
        System.out.println(arr); // prints memmory address
        //   [I@38af3868
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i=0; i<arr.length; i++) {
            arr[i]= arr[i] + i+1;
        }
        System.out.println();

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
