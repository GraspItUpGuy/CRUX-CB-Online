public class pailandrome {
    public static void main(String[] args){
        String s = "puneet";
int p=0;
        for(int i=0; i<s.length() /2;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 -i)){

                p=1;
            }
        }
        if(p==0){
            System.out.println("pailandrome");
        }else{
            System.out.println("not a pailandrome");
        }
    }
}
