
public class Main
{
    public static void main(String[] args)
     {
        Employee worker1 = new FullTimeEmployee("Muhammed Çubukçu", 8528.2);
        Employee worker2 = new PartTimeEmployee("Miraç Egemen",8, 133.3);

        System.out.println(" Name : "+ worker1.name + "\n Monthly salary is : " +  worker1.calculateSalary() + "$");
        System.out.println(" Name : "+ worker2.name + "\n Part time salary is : " +  worker2.calculateSalary() + "$") ;
     }
}