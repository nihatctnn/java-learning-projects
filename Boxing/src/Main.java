public class Main
{
    public static void main(String[] args)
     {
        Fighter f1 = new Fighter("Nasrullah Gökçek",40, 100,70, 60);
        Fighter f2 = new Fighter("Refik Polat", 10, 100, 100, 20);

        Match match = new Match(f1, f2, 40, 100);
        match.run();

     }
}