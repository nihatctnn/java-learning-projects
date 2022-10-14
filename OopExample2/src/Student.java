public class Student
{
   private int midTerm;
   private int finalExam;

   public Student(int midTerm, int finalExam)
    {
        setMidTerm(midTerm);
        setFinalExam(finalExam);
    }

    public void setMidTerm(int midTerm)
     {
         if(midTerm < 0 || midTerm > 100)
          {
              throw new IllegalArgumentException("Midterm cannot be less than 0 or greater than 100 !");
          }

         this.midTerm = midTerm;

     }

     public void setFinalExam(int finalExam)
      {
          if(finalExam <0 || finalExam > 100)
           {
              throw new IllegalArgumentException("Final exam cannot be less than 0 or greater than 100 !");
           }

          this.finalExam = finalExam;
      }

      public int getMidTerm()
        {
          return this.midTerm;
        }

      public int getFinalExam()
        {
          return this.finalExam;
        }

      public double getAverage()
        {
          return midTerm * 0.4 + finalExam * 0.6;
        }

        public void getMessage()
         {
             if(midTerm < 0 || midTerm > 100)
              {
                  System.out.println(getMidTerm());
              }

             else
              {
                  System.out.println(getFinalExam());
              }
         }
}