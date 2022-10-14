import java.util.Scanner;

public class Main
{
    public static void main ( String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int halfCircum, side1, side2, side3;
        double result;

        System.out.print("Please enter a number for side1 :");
        side1 = inp.nextInt();

        System.out.print("Please enter a number for side2 :");
        side2 = inp.nextInt();

        System.out.print("Please enter a number for side3 :");
        side3 = inp.nextInt();

        halfCircum = (side1 + side2 + side3) / 2;
        result = Math.sqrt(halfCircum * (halfCircum - side1) * (halfCircum - side2) * (halfCircum - side3));

        System.out.println("The area is : " + result);

    }
}