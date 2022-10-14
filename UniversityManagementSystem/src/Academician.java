public class Academician extends Worker
{
    private String department;
    private String degree;

    public Academician(String department, String degree, String nameSurname, String phoneNo, String eMail)
      {
         super(nameSurname, phoneNo, eMail);
         this.department = department;
         this.degree = degree;
      }

    public String getDepartment()
      {
          return department;
      }

    public String getDegree()
      {
          return degree;
      }

    public void setDepartment(String department)
      {
          this.department = department;
      }

    public void setDegree(String degree)
      {
          this.degree = degree;
      }

    public void attendClass()
      {
          System.out.println("Information : " + this.getNameSurname() + " joined the class.");
      }

}