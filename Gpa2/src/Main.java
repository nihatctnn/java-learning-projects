import java.util.Scanner;

public class Main
{
    public static void main ( String[] args)
     {
        Scanner inp = new Scanner(System.in);

         int math, physc, chm, tur, msc;
         float sum, average = 0;
         String situation;

         System.out.print("Please enter your math grade : ");
         math = inp.nextInt();

         System.out.print("Please enter your physics grade : ");
         physc = inp.nextInt();

         System.out.print("Please enter your chemistry grade : ");
         chm = inp.nextInt();

         System.out.print("Please enter your turkish grade : ");
         tur = inp.nextInt();

         System.out.print("Please enter your music grade :");
         msc = inp.nextInt();



         // None of them is between 0 and 100

         if ((math < 0 || math > 100) && (physc < 0 || physc > 100) && (chm < 0 || chm > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
            {
             System.out.print("Error! All your grades are either less than 0 or greater than 100! ");
            }


         // Only one by entered correctly.

         else if ((physc < 0 || physc > 100) && (chm < 0 || chm > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
            {
                sum = math;
                average = sum;
            }

         else if ((math < 0 || math > 100) && (chm < 0 || chm > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
         {
             sum = physc;
             average = sum;
         }

         else if ((physc < 0 || physc > 100) && (math < 0 || math > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
         {
             sum = chm;
             average = sum;
         }

         else if ((physc < 0 || physc > 100) && (chm < 0 || chm > 100) && (math < 0 || math > 100) && (msc < 0 || msc > 100))
         {
             sum = tur;
             average = sum;
         }

         else if ((physc < 0 || physc > 100) && (chm < 0 || chm > 100) && (tur < 0 || tur > 100) && (math < 0 || math > 100))
         {
             sum = msc;
             average = sum;
         }


        // Three entered incorrectly.

         else if ((math < 0 || math > 100) && (physc < 0 || physc > 100) && (chm < 0 || chm > 100))
         {
             sum = tur + msc;
             average = sum / 2;
         }

         else if ((math < 0 || math > 100) && (physc < 0 || physc > 100) && (msc < 0 || msc > 100))
         {
             sum = tur + chm;
             average = sum / 2;
         }

         else if ((math < 0 || math > 100) && (physc < 0 || physc > 100) && (tur < 0 || tur > 100))
         {
             sum = chm + msc;
             average = sum / 2;
         }

         else if ((math < 0 || math > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
         {
             sum = physc + chm;
             average = sum / 2;
         }

         else if ((math < 0 || math > 100) && (chm < 0 || chm > 100) &&  (msc < 0 || msc > 100) )
         {
             sum = physc + tur;
             average = sum / 2;
         }

         else if ((math < 0 || math > 100) && (chm < 0 || chm > 100) && (tur < 0 || tur > 100))
         {
             sum = physc + msc;
             average = sum / 2;
         }


         else if ((chm < 0 || chm > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
         {
             sum = math + physc;
             average = sum / 2;
         }


         else if ((physc < 0 || physc > 100) && (tur < 0 || tur > 100) && (msc < 0 || msc > 100))
         {
             sum = math + chm;
             average = sum / 2;
         }

         else if ((physc < 0 || physc > 100) && (chm < 0 || chm > 100) && (msc < 0 || msc > 100))
         {
             sum = tur + math;
             average = sum / 2;
         }

         else if ((physc < 0 || physc > 100) && (chm < 0 || chm > 100) && (tur < 0 || tur > 100))
         {
             sum = math + msc;
             average = sum / 2;
         }


         // Two entered incorrectly.

         else if ((tur < 0 || tur > 100) && (msc < 0 || msc > 100))
            {
             sum = math + physc + chm;
             average = sum / 3;
            }

         else if ((chm < 0 || chm > 100) && (tur < 0 || tur > 100))
         {
             sum = math + physc + msc;
             average = sum / 3;
         }

         else if ((chm < 0 || chm > 100) && (msc < 0 || msc > 100))
         {
             sum = math + physc + tur;
             average = sum / 3;
         }

         else if ((physc < 0 || physc > 100) && (chm < 0 || chm > 100))
         {
             sum = math + msc + tur;
             average = sum / 3;
         }

         else if ((physc < 0 || physc > 100) && (tur < 0 || tur > 100))
         {
             sum = math + chm + msc ;
             average = sum / 3;
         }

         else if ((physc < 0 || physc > 100) && (msc < 0 || msc > 100))
         {
             sum = math + chm + tur;
             average = sum / 3;
         }

         else if ((math < 0 || math > 100) && (physc < 0 || physc > 100))
         {
             sum = msc + chm + tur;
             average = sum / 3;
         }

         else if ((math < 0 || math > 100) && (chm < 0 || chm > 100))
         {
             sum = physc + msc + tur;
             average = sum / 3;
         }

         else if ((math < 0 || math > 100) && (tur < 0 || tur > 100))
         {
             sum = physc + chm + msc;
             average = sum / 3;
         }

         else if ((math < 0 || math > 100) && (msc < 0 || msc > 100))
         {
             sum = physc + chm + tur;
             average = sum / 3;
         }


         // Only one by entered incorrectly.

         else if ((msc < 0 || msc > 100))
            {
             sum = math + physc + chm + tur;
             average = sum / 4;
            }

         else if ((tur < 0 || tur > 100))
         {
             sum = math + physc + chm + msc;
             average = sum / 4;
         }

         else if ((chm < 0 || chm > 100))
         {
             sum = math + physc + tur + msc;
             average = sum / 4;
         }

         else if ((physc < 0 || physc > 100))
         {
             sum = math + chm + tur + msc;
             average = sum / 4;
         }

         else if ((math < 0 || math > 100))
          {
               sum = physc + chm + tur + msc;
               average = sum / 4;
          }


         // All entered correctly.

         else
            {
             sum = math + physc + chm + tur + msc;
             average = sum / 5;
            }

         System.out.println("Your gpa is :" + average);
         situation = (average >= 55.0) ? "You passed the class :) " : "You failed the class :(";
         System.out.println(situation);

     }
}