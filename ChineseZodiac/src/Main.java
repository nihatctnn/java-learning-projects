import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
     {
           int birth;
           int result;

           Scanner input = new Scanner(System.in);

           System.out.print("Please enter your birthdate :");
           birth = input.nextInt();

           result = birth % 12;

           switch(result)
            {
                case 0:
                    System.out.print("The Chinese Zodiac is : Monkey");
                    break;

                case 1:
                    System.out.println("The Chinese Zodiac is : Cockerel");
                    break;

                case 2:
                    System.out.println("The Chinese Zodiac is : Dog");
                    break;

                case 3:
                    System.out.println("The Chinese Zodiac is : Pig");
                    break;

                case 4:
                    System.out.println("The Chinese Zodiac is : Mouse");
                    break;

                case 5:
                    System.out.println("The Chinese Zodiac is : Bull");
                    break;

                case 6:
                    System.out.println("The Chinese Zodiac is : Tiger");
                    break;

                case 7:
                    System.out.println("The Chinese Zodiac is : Rabbit");
                    break;

                case 8:
                    System.out.println("The Chinese Zodiac is : Dragon");
                    break;

                case 9:
                    System.out.println("The Chinese Zodiac is : Snake");
                    break;

                case 10:
                    System.out.println("The Chinese Zodiac is : Horse");
                    break;

                case 11:
                    System.out.println("The Chinese Zodiac is : Sheep");
                    break;

                default :
                    System.out.println("Please check your birth date !");
            }
     }
}