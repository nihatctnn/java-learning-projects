public class Match
{
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight)
     {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

     }

     void run()
       {
           if(isCheck())
             {
                while(this.f1.health > 0 && this.f2.health >0)
                 {
                     System.out.println("=== New Round ===");

                     double number = Math.random();     // 0 < number < 1

                     if(number < 0.5)    // For first punch
                      {
                         this.f2.health = this.f1.hit(this.f2);
                         System.out.println("Mike Tyson's health : " + this.f2.health);

                         if (isWin()) {
                             break;
                         }

                          System.out.println("\n");
                      }


                     else
                      {
                         this.f1.health = this.f2.hit(this.f1);
                         System.out.println("Hasbulla 's health :" + this.f1.health);

                         if (isWin()) {
                             break;
                         }

                         System.out.println("\n");
                      }

                 }

             }

           else
             {
                System.out.println("Boxers' weights are not the same.");
             }

       }


     boolean isCheck()
       {
           return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
       }

     boolean isWin()
       {
           if(this.f1.health == 0)
             {
                 System.out.println(this.f2.name +"\t"+ "WON !");
                 return true;
             }

           if(this.f2.health == 0)
             {
                 System.out.print(this.f1.name +"\t"+ "WON !");
                 return true;
             }

           return false;
       }
}