public class StringBasics {
    public static void main(String[] args){

//        String str = "hello";
//        System.out.println(str.length());
//        System.out.println(str.charAt(1));
//
//        System.out.println(str.substring(1,4));
//        System.out.println(str.codePointAt(3));
//       String str2 = "user";
//        System.out.println( str.concat(str));
//        System.out.println(str);
//        System.out.println(str.concat(str2));
//        System.out.println(str2);
//       int in =  str.indexOf("o");
//        System.out.println(in);
//
//        System.out.println(str.startsWith("HE"));

//        String one = "Heyaa";
//        String two = "Heyaa";
//        if(one == two){
//            System.out.println("similar");
//        }
//       String three = new String("Heyaa");
//        // for strings == checks addressed where as str.equals() checks by value and address
//
//        if(one == three) {
//            System.out.println("similar");
//        }else{
//            System.out.println("not similar");
//
//        }
//        System.out.println(one.equals(three));


//        String str =  "abcd";
//
//        for (int si = 0; si <str.length()-1 ; si++) {
//            for (int ei = si+1; ei < str.length(); ei++) {
//                String ss = str.substring(si,ei);
//                System.out.println(ss);
//            }
//        }



        long start = System.currentTimeMillis();
        appendStringSB(100000);

        long end =System.currentTimeMillis();
        System.out.println("time taken is : " +  (end-start));



        }

        public static void appendString(int n){
        String s = "";
            for (int i = 0; i <=n ; i++) {
                s = s + i;
            }
        }
    public static void appendStringSB(int n){
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i <=n ; i++) {
            s.append(i);
        }
    }

}
