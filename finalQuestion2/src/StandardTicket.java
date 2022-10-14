public class StandardTicket extends Ticket
{
    double price;

    public StandardTicket(int seatNumber, int number)
     {
         super( seatNumber, number);
         this.price = 10;
     }

    @Override
    public void print()
     {
         System.out.println(seatNumber + " " + price + " " + number);
     }

    @Override
    public double computePrice()
     {
         return this.price;
     }


}