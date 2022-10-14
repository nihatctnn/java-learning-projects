import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int distance, age, type;
        double total, discount;

        System.out.print("Please enter the distance (km) : ");
        distance = inp.nextInt();

        System.out.print("Please enter your age : ");
        age = inp.nextInt();

        System.out.print("Enter the type of trip (1 (One Way), 2 (Round Trip) : ");
        type = inp.nextInt();

        total = distance * 0.10;
        System.out.println("Price without discount : " + total);

        if ((distance < 0 || age < 0) || !(type == 1 || type == 2))
        {
            System.out.println("You entered wrong data");
        }

        else if (age < 12)
        {
            total *= 0.5;
        }

        else if (age < 24)
        {
            discount = total * 0.1;
            total -= discount;
        }

        else if (age > 65)
        {
            discount = total * 0.3;
            total -= discount;
        }

        if( type == 2)
        {
            discount = total * 0.2;
            total -= discount;
        }

        System.out.println("Discounted price : " + total);
    }
}
