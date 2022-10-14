import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int month;
        int day;
        String horoscope = "";
        boolean isThere = false;


        System.out.print("Please enter the month in which you were born (number) : ");
        month = inp.nextInt();

        System.out.print("Please enter the day on which you were born (number) : ");
        day = inp.nextInt();


        if(month == 1)                               // 1st month of the year
          {
             if(day < 22)                            // Means Capricorn until January 22
              {
                  horoscope = "Capricorn (Oğlak)";
                  isThere = true;
              }

             else if(day <= 31)                      // From January 22 to January 31 means Aquarius
              {
                  horoscope = "Aquarius (Kova)";
                  isThere = true;
              }

          }


        else if(month == 2)
          {

             if(day < 20)
              {
                 horoscope = "Aquarius (Kova)";
                 isThere = true;
              }

             else if(day <= 28)
              {
                 horoscope = "Pisces (Balık)";
                 isThere = true;
              }

          }


        else if(month == 3)
          {

            if(day < 21)
             {
                horoscope = "Pisces (Balık)";
                isThere = true;
             }

            else if(day <= 31)
             {
                horoscope = "Aries (Koç)";
                isThere = true;
             }

          }


        else if(month == 4)
          {

            if(day < 21)
             {
                horoscope = "Aries (Koç)";
                 isThere = true;
             }

            else if(day <= 30)
             {
                horoscope = "Taurus (Boğa)";
                 isThere = true;
             }

          }


        else if(month == 5)
          {

            if(day < 22)
             {
                horoscope = "Taurus (Boğa)";
                isThere = true;
             }

            else if(day <= 31)
             {
                horoscope = "Gemini (İkizler)";
                isThere = true;
             }

          }


        else if(month == 6)
          {

            if(day < 23)
             {
                horoscope = "Gemini (İkizler)";
                isThere = true;
             }

            else if(day <= 30)
             {
                horoscope = "Cancer (Yengeç)";
                isThere = true;
             }

          }


        else if(month == 7)
          {

            if(day < 23)
             {
                horoscope = "Cancer (Yengeç)";
                isThere = true;
             }

            else if(day <= 31)
             {
                horoscope = "Leo (Aslan)";
                isThere = true;
             }

          }


        else if(month == 8)
          {

            if(day < 23 )
             {
                horoscope = "Leo (Aslan)";
                isThere = true;
             }

            else if(day <= 31)
             {
                horoscope = "Virgo (Başak)";
                isThere = true;
             }

          }


        else if(month == 9)
          {

            if(day < 23)
             {
                horoscope = "Virgo (Başak)";
                isThere = true;
             }

            else if(day <= 30)
             {
                horoscope = "Libra (Terazi)";
                isThere = true;
             }

          }


        else if(month == 10)
          {

            if(day < 23 )
             {
                horoscope = "Libra (Terazi)";
                isThere = true;
             }

            else if(day <=31 )
             {
                horoscope = "Scorpio (Akrep)";
                isThere = true;
             }

          }


        else if(month == 11)
          {

            if(day < 22)
             {
                horoscope = "Scorpio (Akrep)";
                isThere = true;
             }

            else if(day <= 30 )
             {
                horoscope = "Sagittarius (Yay)";
                isThere = true;
             }

          }


        else if(month == 12)
          {

            if(day < 22)
             {
                horoscope = "Sagittarius (Yay)";
                isThere = true;
             }

            else if(day <= 31)
             {
                horoscope = "Capricorn (Oğlak)";
                isThere = true;
             }

          }


        else
          {
            System.out.println("You have entered incorrectly, please check your information and try again.");
          }



        if(isThere == true)
         {
            System.out.println("Your horoscope is : " + horoscope);
         }

        else
         {
             System.out.println("You have entered incorrectly, please check your information and try again.");
         }

        System.out.println("Please don't believe in horoscopes ! ");

    }
}