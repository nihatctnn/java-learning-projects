public class CanonProfessional extends Printer implements IColoredPrint, IFax, IScan
{

    @Override
    public void print()
     {
         System.out.println("Canon Professional is printing...");
     }

     @Override
     public void coloredPrint()
      {
          System.out.println("Canon Professional is printing color output...");
      }

    @Override
    public void fax()
     {
         System.out.println("Canon Professional sending fax...");
     }

    @Override
    public void scan()
     {
         System.out.println("Canon Professional is scanning...");
     }

}