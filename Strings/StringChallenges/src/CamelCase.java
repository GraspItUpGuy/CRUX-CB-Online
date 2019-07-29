public class CamelCase {
    public static void main(String[] args){

        String str = "IAmACompetitiveProgrammer";

        for (int i = 0; i < str.length(); i++) {
           if( i!=0 && Character.isUpperCase(str.charAt(i))){
               System.out.println();


           }
            System.out.print(str.charAt(i));
        }

    }
}
