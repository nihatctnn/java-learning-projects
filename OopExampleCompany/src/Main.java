public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(2,"Muhammed");
        Employee e2 = new Employee(9,"Nihat");
        Employee e3 = new Employee(4,"Egemen");

        Employee[] emps = {e1, e2, e3};

        Company comp1 = new Company(CompanyName.IBM, emps);
        Company comp2 = new Company(CompanyName.APPLE,emps);
        Company comp3 = new Company(CompanyName.MICROSOFT, emps);

        System.out.println(comp1.getCompanyName() + "\t\t\t -->\t" + e1.toString());
        System.out.println(comp2.getCompanyName() + "\t\t -->\t" + e2.toString());
        System.out.println(comp3.getCompanyName() + "\t -->\t" + e3.toString());

    }
}