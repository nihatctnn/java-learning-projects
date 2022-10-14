public class LaboratoryAssistant extends Assistant
{
    public LaboratoryAssistant( String nameSurname, String phoneNo, String eMail, String department, String degree,String officeTime)
     {
         super(nameSurname, phoneNo, eMail, department, degree, officeTime);
     }

     public void enterLab()
      {
          System.out.println("Information : " + this.getNameSurname() + " entered the Lab");
      }
}