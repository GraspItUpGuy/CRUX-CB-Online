
public class insertAscii {
    public static void main(String[] args){
        String str = "Puneet";
        int diff;
        String s = "";
        for(int i=0; i<str.length()-1;i++){
            diff = (int)str.charAt(i+1)-(int)str.charAt(i);

           s += (char)str.charAt(i) +  diff + (char)str.charAt(i+1);
        }

        System.out.println(s);
    }
}
