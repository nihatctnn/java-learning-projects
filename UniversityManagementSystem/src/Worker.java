public class Worker
{
    private String nameSurname;
    private String phoneNo;
    private String eMail;

    public Worker(String nameSurname, String phoneNo, String eMail)
      {
         this.nameSurname = nameSurname;
         this.phoneNo = phoneNo;
         this.eMail = eMail;
      }

    public String getNameSurname()
       {
          return nameSurname;
       }

    public String getPhoneNo()
       {
           return phoneNo;
       }

    public String geteMail()
       {
           return eMail;
       }

    public void setNameSurname(String nameSurname)
       {
           this.nameSurname = nameSurname;
       }

    public void setPhoneNo(String phoneNo)
       {
           this.phoneNo = phoneNo;
       }

    public void seteMail(String eMail)
       {
           this.eMail = eMail;
       }

    public void login()
       {
           System.out.println("\nInformation : " + this.nameSurname + " entered the university.");
       }

    public void exit()
       {
           System.out.println("Information : " + this.nameSurname + " exited the university.");
       }

    public void refectory()
       {
           System.out.println("Information : " + this.nameSurname + " entered the refectory.");
       }
}