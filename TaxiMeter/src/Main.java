import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int km ;
        double perKm = 2.20, total = 10;

        System.out.print("Please enter your route in km : ");
        km = input.nextInt();

        total += (km * perKm);

        total = (total < 20) ? 20 : total ;                         // The minimum amount you will pay is going to be $20.
        System.out.print("The amount you will pay is : " + total);

    }

}
