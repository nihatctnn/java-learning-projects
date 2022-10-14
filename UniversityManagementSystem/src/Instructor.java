public class Instructor extends Academician
{
    private int doorNo;

    Instructor(String department, String degree, String nameSurname, String phoneNo, String eMail, int doorNo)
     {
         super(department, degree, nameSurname, phoneNo, eMail);
         this.doorNo = doorNo;
     }

    public int getDoorNo()
     {
         return doorNo;
     }

    public void setDoorNo(int doorNo)
     {
         this.doorNo = doorNo;
     }

    public void senateMeeting()
     {
       System.out.println("Information : " + this.getNameSurname() + " attended the Senate meeting.");
     }

    public void doExam()
     {
       System.out.println("Information : " + this.getNameSurname() + " did the exam.");
     }

}