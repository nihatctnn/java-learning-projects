import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);

        double pi = 3.14, result;
        int r, ang;

        System.out.print("Please enter the radius of the circle : ");
        r = inp.nextInt();

        System.out.print("Please enter the angle of circle : ");
        ang = inp.nextInt();

        result = (pi * (r * r) * ang) / 360 ;

        System.out.print("The result is : " + result);
    }
}
