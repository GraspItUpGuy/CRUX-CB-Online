public class StringCompression {
    public static void main(String[] args) {

        String str = "Puneet";
        StringBuilder Cstr = new StringBuilder("");

        int run=0;
        int counter = 0;
        for (int i = 0; i < str.length()-1 ; i++) {

            run++;

            if (str.charAt(i+1) == str.charAt(i)  ) {
                counter++;
            }else{
                if(counter < 1){
                    Cstr.append(str.charAt(i));
                }else{
                    Cstr.append(counter + 1);
                    Cstr.append(str.charAt(i));

                }
                counter =0;
            }



        }
        Cstr.append(str.charAt(str.length() -1));
        System.out.println(Cstr);
        System.out.println(run);
    }
}