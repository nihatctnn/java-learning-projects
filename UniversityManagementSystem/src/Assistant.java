public class Assistant extends Academician
{
    private String officeTime;

    public Assistant(String nameSurname, String phoneNo, String eMail, String department, String degree, String officeTime)
     {
         super(department, degree, nameSurname, phoneNo, eMail);
         this.officeTime = officeTime;
     }

    public String getOfficeTime()
     {
         return officeTime;
     }

    public void setOfficeTime(String officeTime)
     {
         this.officeTime = officeTime;
     }

    public void doQuiz()
     {
         System.out.println("Information : " + this.getNameSurname() + " did a quiz.");
     }

}