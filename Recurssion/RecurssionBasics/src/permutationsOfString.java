import java.util.ArrayList;

public class permutationsOfString {
    public static void main(String[] args){

        System.out.println( permutationsOfString("abc"));

    }// main ended here

    public static ArrayList<String> permutationsOfString(String str){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
         }

        char ch = str.charAt(0);
        String ros = str.substring(1);
       ArrayList<String> recResult =  permutationsOfString(ros);
       ArrayList<String> myResult  = new ArrayList<>();


       for(String rrs : recResult){
           for(int i = 0; i<rrs.length(); i++){
               String val = rrs.substring(0,i) + ch + rrs.substring(i);
               myResult.add(val);
           }
       }
       return myResult;
    }


}// class termination
