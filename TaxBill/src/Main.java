import java.util.Scanner;

public class Main

{
    public static void main (String[] args)
     {
        float finalPrice, tax, price, sit1 = 0.18f, sit2 = 0.08f;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the price of product :");
        price = input.nextFloat();

        finalPrice = (price <= 1000 && price > 0) ? ( price + price * sit1 ) : (price + price * sit2 );
        tax = finalPrice - price;

        System.out.println("Price of product is :" + price);
        System.out.println("Final price is : " + finalPrice);
        System.out.println("Price of tax is : " + tax);

      }
}
