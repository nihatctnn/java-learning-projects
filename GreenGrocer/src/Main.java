import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        double pear = 2.14, pearU, apple = 3.67, appleU, tomato = 1.11, tomatoU, banana = 0.95, bananaU, eggplant = 5.00, eggplantU,  result;

        System.out.print("How many kilos of pears did you buy ? : ");
        pearU = inp.nextDouble();

        System.out.print("How many kilos of apples did you buy? : ");
        appleU = inp.nextDouble();

        System.out.print("How many kilos of tomatoes did you buy? : ");
        tomatoU = inp.nextDouble();

        System.out.print("How many kilos of bananas did you buy? : ");
        bananaU = inp.nextDouble();

        System.out.print("How many kilos of eggplant did you buy? :");
        eggplantU = inp.nextDouble();

        result = (pear * pearU) + (apple * appleU) + (tomato * tomatoU) + (banana * bananaU) + (eggplant * eggplantU);

        System.out.println("The amount you will pay is : " + result);

    }
}
