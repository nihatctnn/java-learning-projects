public class CommissionEmployee extends Employee
{
    double grossSale;
    double commissionRate;

    public CommissionEmployee(String lastName, int socSecNum, double grossSale, double commissionRate)
     {
         super(lastName, socSecNum);
         this.grossSale = grossSale;
         this.commissionRate = commissionRate;
     }

    @Override
    public double earning()
     {
         return commissionRate * grossSale;
     }

}