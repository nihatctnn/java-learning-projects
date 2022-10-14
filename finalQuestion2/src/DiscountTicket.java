public class DiscountTicket extends StandardTicket
{

    double discount;

    public DiscountTicket( int seatNumber, int number, double discount)
     {
         super( seatNumber, number);
         this.discount = discount;
     }

    @Override
    public void print()
     {
         System.out.println(this.seatNumber + " " + this.price + " " + this.number + " " + this.discount);
     }

    @Override
    public double computePrice()
     {
         return super.computePrice() - (this.price * this.discount);
     }
}