import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {

        int math, physc, chm, tur, his, msc;
        float sum, result;
        String situation;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your math grade : ");
        math = inp.nextInt();

        System.out.print("Please enter your physics grade : ");
        physc = inp.nextInt();

        System.out.print("Please enter your chemistry grade : ");
        chm = inp.nextInt();

        System.out.print("Please enter your turkish grade : ");
        tur = inp.nextInt();

        System.out.print("Please enter your history grade :");
        his = inp.nextInt();

        System.out.print("Please enter your music grade :");
        msc = inp.nextInt();

        sum = (math + physc + chm + tur + his + msc );
        result = sum / 6 ;

        System.out.println("Your gpa is :" + result);
        situation = (result >= 60.0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(situation);
    }

}
