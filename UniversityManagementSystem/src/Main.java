public class Main
{
    public static void main(String[] args)
     {

         Worker w1 = new Worker("Nihat Çetin", "0123 456 78 90", "info@gmail.com");

         w1.login();
         System.out.println("Information : " + "Phone Number : " + w1.getPhoneNo() + " ---> Mail : " + w1.geteMail());
         w1.refectory();
         w1.exit();

         System.out.println("\n-------------------------------------------");

         Academician a1 = new Academician("Engineering Faculty", "Professor", "Muhammed Çubukçu", "0987 654 32 10", "mail@gmail.com");

         a1.login();
         System.out.println("Information : " + a1.getDepartment() + " ---> " + a1.getDegree() + " ---> Phone Number : " + a1.getPhoneNo() + " ---> Mail : " + a1.geteMail());
         a1.attendClass();
         a1.refectory();
         a1.exit();

         System.out.println("\n-------------------------------------------");

         Officier o1 = new Officier("Ayşe", "02323 232 32 23","moon@gmail.com", "Cleaning Staff", "Day Shift");

         o1.login();
         System.out.println("Information : " + o1.getPhoneNo() + " ---> " + o1.geteMail() + " ---> " + o1.getSection() + " ---> " + o1.getShift());
         o1.work();
         o1.refectory();
         o1.exit();

         System.out.println("\n-------------------------------------------");

         Instructor i1 = new Instructor("Engineering Faculty", "Professor", "Miraç Egemen Bilgin", "0123 123 12 13", "mir@gmsil.com", 123);

         i1.login();
         System.out.println("Information : " + i1.getDepartment() + " ---> " + i1.getDegree() + " ---> " + i1.getPhoneNo() + " ---> " + i1.geteMail() + " ---> Door No : " + i1.getDoorNo());
         i1.attendClass();
         i1.doExam();
         i1.senateMeeting();
         i1.refectory();
         i1.exit();

         System.out.println("\n-------------------------------------------");

         Assistant as1 = new Assistant("Furkan Akyol", "0456 456 45 46", "yol@gmail.com", "Faculty of Health", "Research Assistant", "09.00 am - 06.00 pm");

         as1.login();
         System.out.println("Information : "  + as1.getDepartment() + " ---> " + as1.getDegree() + " ---> " + as1.getPhoneNo() + " ---> " + as1.geteMail() + " ---> " + as1.getOfficeTime());
         as1.attendClass();
         as1.doQuiz();
         as1.refectory();
         as1.exit();

         System.out.println("\n-------------------------------------------");

         LaboratoryAssistant labAs1 = new LaboratoryAssistant("Fatih Çakılcıoğlu", "0789 789 78 79", "fetih@gmail.com", "Faculty of Health", "Research Assistant", "09.00 am - 06.00 pm");

         labAs1.login();
         System.out.println("Information : " + labAs1.getNameSurname() + " : " + labAs1.getDepartment() + " ---> " + labAs1.getDegree() + " ---> " + labAs1.getPhoneNo() + " ---> " + labAs1.geteMail() + " ---> " + labAs1.getOfficeTime());
         labAs1.attendClass();
         labAs1.doQuiz();
         labAs1.enterLab();
         labAs1.refectory();
         labAs1.exit();

         System.out.println("\n-------------------------------------------");

         InformationProcessingCenter infProCen1 = new InformationProcessingCenter("Nesrullah Gökçek", "0365 365 36 35", "gökqgmail.com", "IT Center Officer", "Day Shift", " Finding and fixing network errors.");

         infProCen1.login();
         System.out.println("Information : " + "Phone Number : " + w1.getPhoneNo() + " ---> Mail : " + w1.geteMail() + " ---> " + infProCen1.getSection() + " ---> " + infProCen1.getShift() + " --->  Duty :" + infProCen1.getDuty());
         infProCen1.networkSetup();
         infProCen1.work();
         infProCen1.refectory();
         infProCen1.exit();

         System.out.println("\n-------------------------------------------");

         Security guard1 = new Security("Ramazan Koruyucu", "0147 147 14 17", "koru@gmail.com", "Security", "Day Shift", " Examining documents and ensuring security.");

         guard1.login();
         System.out.println("Information : " + "Phone Number : " + guard1.getPhoneNo() + " ---> Mail : " + guard1.geteMail() + " ---> " + guard1.getSection() + " ---> " + guard1.getShift() + " --->  Duty :" + guard1.getDocument());
         guard1.watch();
         guard1.getDocument();
         guard1.work();
         guard1.refectory();
         guard1.exit();

     }
}