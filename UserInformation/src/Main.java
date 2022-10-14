import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String userName, password, option, newPassword;

        System.out.print("Please enter your username : ");
        userName = input.nextLine();

        System.out.print("Please enter your password : ");
        password = input.nextLine();

        if(userName.equals("Nihat") && password.equals("Java101"))
        {
            System.out.println("Successful :)");
        }
        else
        {
            System.out.println("Please Try Again :(");

            System.out.print("Would you like to reset your password ? Yes/No ? : ");
            option = input.nextLine();

            if(option.equals("Yes") || option.equals("yes"))
            {
                System.out.print("Please enter your new password :");
                newPassword = input.nextLine();

                if( newPassword.equals("Java101") )
                {
                    System.out.println("The new password can not be the previous one !");
                    System.out.print("Please rerun the program and try again ");

                }

                else if( newPassword.equals(password))
                {
                    System.out.println("The new password cannot be the password that you just entered incorrectly !");
                    System.out.print("Please rerun the program and try again ");
                }

                else
                {
                    System.out.print("The chancing password is successful. :) ");
                }

            }

        }

    }
}