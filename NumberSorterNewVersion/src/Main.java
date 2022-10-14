import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n, total = 0;

        do
         {
            System.out.print("Please enter a number :");
            n = scan.nextInt();

            if(n % 4 == 0)
             {
                total += n;
             }
         }

        while ( n % 2 == 0);

        System.out.print("The sum of the multiples of 4 of the numbers you entered are :" + total);

    }
}