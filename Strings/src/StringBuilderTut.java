import java.util.Scanner;

public class StringBuilderTut {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("abc");
        System.out.println(sb);
        sb.insert(1,"def");
        System.out.println(sb);
        sb.insert(4,"asasa");
        System.out.println(sb);
        sb.insert(sb.length()," atlast");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);


        sb.setCharAt(0,'D');
        System.out.println(sb);

        // convert string builder to string
        String s = sb.toString();
        System.out.println(s);

        // convert string builder to string => no -direct method
        StringBuilder NewSB = new StringBuilder(s);
        System.out.println("ENTER STring Builder");
        // taking input for stringBuilder
        String inp = input.nextLine();
        StringBuilder nsb = new StringBuilder(inp);
        System.out.println(inp);


    }
}
