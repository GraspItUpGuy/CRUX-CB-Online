public class fibonocci {
    public static void main(String[] args){
        System.out.println(fibbo(7));
    }
    public static int fibbo(int n){
      if(n==1){
          return n;
      } else if(n==0){
          return n;
      }

        int term =  fibbo(n-1) + fibbo(n-2);
        return term;

    }
}
