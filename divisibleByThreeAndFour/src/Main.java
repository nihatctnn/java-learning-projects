import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int i, k, sum = 0, counter = 0, average = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number :");
        k = input.nextInt();

        for ( i = 1; i <= k; i++)
          {
              if(i % 3 == 0 && i % 4 == 0)
              {
                  sum += i;
                  counter++;
                  average = sum / counter;

                  System.out.println(i);
              }
          }

        System.out.print("Average of numbers divisible by 3 and 4 : " + average);

    }
}
