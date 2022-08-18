package UserInput_3;

import java.util.Scanner;

public class UserInput
{
    public static void   main(String[] args)
    {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Some number");
        int user_input = scan.nextInt();
        System.out.println("The entered Value is: ");
        System.out.println(user_input);


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Some Character");
        String user_input1 = scan1.next();
        System.out.println(user_input1);

    }
}
