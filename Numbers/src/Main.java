import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int i, k, average = 0, sum = 0, counter = 0;

        System.out.print("Please enter a number which you want :");
        k = inp.nextInt();

        for( i = 1 ; i <= k ; i++ )
          {
             if (i % 3 == 0 && i % 4 == 0)
              {
                 sum += i;
                 counter++;
                 average = sum / counter;
              }

          }

          System.out.print("The average is :" + average);
    }
}
