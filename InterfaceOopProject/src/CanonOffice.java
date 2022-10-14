public class CanonOffice extends Printer implements IFax, IScan
{
    @Override
    public void print()
     {
        System.out.println("Canon Office is printing...");
     }

    @Override
    public void fax()
     {
         System.out.println("Canon Office sending fax...");
     }

    @Override
    public void scan()
     {
        System.out.println("Canon Office is scanning...");
     }
}