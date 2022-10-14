import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        float heat;

        System.out.print("Please enter the temperature value :");
        heat = inp.nextFloat();

        if (heat < 5)
         {
            System.out.print(" You can ski. ");
         }

        else if (heat <= 25)
         {
            if(heat <= 10)
            {
                System.out.println("You can go to a cinema. ");
            }

            else if (heat <= 15)
            {
                System.out.println("You can go to the cinema or make a picnic.");
            }

            else
            {
                System.out.println("You can make a picnic. ");
            }

         }

        else
         {
            System.out.print("You can go swimming. ");
         }

    }

}