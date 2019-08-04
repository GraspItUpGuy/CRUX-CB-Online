public class StringCompression {
    public static void main(String[] args) {

        String str = "abbcccdddeeeeefffff";
        StringBuilder Cstr = new StringBuilder("");


        int counter = 0;
        for (int i = 0; i < str.length()-1 ; i++) {



            if (str.charAt(i+1) == str.charAt(i)  ) {
                counter++;
            }else{
                if(counter < 1){
                    Cstr.append(str.charAt(i));
                }else{
                    Cstr.append(counter + 1);
                    Cstr.append(str.charAt(i));

                }

            }

            counter =0;

        }

        System.out.println(Cstr);

    }
}