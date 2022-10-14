import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);

        double height, weight, bmi  ;                           // bmi means "Body Mass İndex"

        System.out.print("Please enter your height (m) :");
        height = inp.nextDouble();

        System.out.print("Please enter your weight (kg) :");
        weight = inp.nextDouble();

        bmi = weight / (height * height);

        System.out.print("Your Body Mass Index is : " + bmi );

    }
}
