public class Main
{
    public static void main(String[] args)
     {
         Employee e1 = new SalariedEmployee("Çetin", 128, 650);
         Employee e2 = new HourlyEmployee("Çubukçu", 256, 60, 8);
         Employee e3 = new CommissionEmployee("Atalay", 384, 8550, 0.05);
         Employee e4 = new BasePlusCommission("Keskin", 512, 6500, 0.05,350);

         Employee[] list = new Employee[]{e1, e2, e3, e4};

         for(Employee e: list)
          {
              System.out.println("------------");
              System.out.println(e.toString());
          }

     }
}