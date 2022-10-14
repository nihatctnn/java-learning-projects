import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int a, b;
        double c;

        System.out.println("The formula is \"a^2 + b^2 = c^2 \"");

        System.out.print("Please enter a number for \'a\' :");
        a = inp.nextInt();

        System.out.print("Now please enter another number for \'b\' : ");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));                             // We take the square root.

        System.out.println("The hypotenuse (c) is : " + c);
    }

}
