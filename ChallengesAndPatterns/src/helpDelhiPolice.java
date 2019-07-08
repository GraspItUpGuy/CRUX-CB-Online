import java.util.Scanner;

public class helpDelhiPolice {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of car : ");
        int num = input.nextInt();

        int odd=0;
        int even =0;

        while( num!=0){
            int digit = num %10;
            if(digit %2 ==0){
                even+= digit;
            }else{
                odd+=digit;
            }
            num = num/10;
        }

        if(odd%3==0 || even%4 ==0){
            System.out.println("Your car is allowed");
        }else{
            System.out.println("Your car is not allowed, Please use public transport");
        }

    }
}
