public class HourlyEmployee extends Employee
{
    double wage;
    int hours;

    public HourlyEmployee(String lastName, int socSecNum, double wage, int hours)
     {
         super(lastName, socSecNum);
         this.wage = wage;
         this.hours = hours;
     }

    @Override
    public double earning()
     {
        if (hours <= 40)
         {
            return  wage * hours;
         }

        if (hours > 40)
         {
             return 40 * wage + (hours - 40 ) * wage * 1.5;
         }

        return wage;
     }
}