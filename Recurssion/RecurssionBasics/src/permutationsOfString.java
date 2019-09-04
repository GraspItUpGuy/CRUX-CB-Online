import java.util.ArrayList;

public class permutationsOfString {
    public static void main(String[] args){

        System.out.println( permutationsOfString("abc"));

    }// main ended here

    public static ArrayList<String> permutationsOfString(String str) {

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
         }

        char ch = str.charAt(0);
        String ros = str.substring(1);
       ArrayList<String> rr =  permutationsOfString(ros);
       ArrayList<String> mr  = new ArrayList<>();


       for(String rrs : rr){
           for(int i = 0; i<rrs.length(); i++){
               String val = rrs.substring(0,i) + ch + rrs.substring(i);
               mr.add(val);
           }
       }
       return mr;
    }


}// class termination
