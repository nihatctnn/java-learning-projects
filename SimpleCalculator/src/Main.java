import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int option;
        double number1, number2;

        System.out.print("Please enter a number for number1 :");
        number1 = input.nextDouble();

        System.out.print("Please enter another number for number2 :");
        number2 = input.nextDouble();

        System.out.println("You can do addition (1), subtraction (2), multiplication (3), and division (4). ");

        System.out.print("Please choose an option : ");
        option = input.nextInt();

        switch(option)
        {
            case 1:
                System.out.print("The result is : " + (number1 + number2));
                break;

            case 2 :
                System.out.print("The result is : " + (number1 - number2));
                break;

            case 3 :
                System.out.print("The result is : " + (number1 * number2));
                break;

            case 4 :
                if(number2 == 0)
                {
                    System.out.print("A number divided by zero is undefined.");
                }
                else
                {
                    System.out.print("The result is : " + (number1 / number2));
                }
                break;

            default :
                System.out.print("You entered wrong number :(");
                break;
        }
    }
}
