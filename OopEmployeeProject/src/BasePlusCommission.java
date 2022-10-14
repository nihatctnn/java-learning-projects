public class BasePlusCommission extends CommissionEmployee
{
    double baseSalary;

    public BasePlusCommission(String lastName, int socSecNum, double grossSale, double commissionRate, double baseSalary)
     {
         super(lastName, socSecNum, grossSale, commissionRate);
         this.baseSalary = baseSalary;
     }

    @Override
    public double earning()
     {
         return super.earning() + this.baseSalary;
     }

}