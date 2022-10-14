public class Main
{
    public static void main(String[] args)
     {
        CanonBasic canon1 = new CanonBasic();
        CanonOffice canon2 = new CanonOffice();
        CanonProfessional canon3 = new CanonProfessional();

        System.out.println("\n--- Canon Basic ---\n");

        canon1.print();
        canon1.scan();

        System.out.println("\n--- Canon Office ---\n");

        canon2.fax();
        canon2.print();
        canon2.scan();

        System.out.println("\n--- Canon Professional ---\n");

        canon3.coloredPrint();
        canon3.fax();
        canon3.print();
        canon3.scan();

     }
}