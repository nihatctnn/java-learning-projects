import java.util.List;
import java.util.ArrayList;

public class TicketApp
{
    public static void main(String[] args)
     {
         Ticket t1 = new StandardTicket(10, 1);
         Ticket t2 = new DiscountTicket(22, 2, 0.1);
         Ticket t3 = new DiscountTicket(12, 3, 0.2);
         Ticket t4 = new StandardTicket(35, 4);

         List <Ticket> tickets = new ArrayList<> ();
         tickets.add(t1);
         tickets.add(t2);
         tickets.add(t3);
         tickets.add(t4);

         SeatComparator s1 = new SeatComparator();
         s1.SortAndPrint(tickets);

         TicketSeller ts = new TicketSeller(tickets);
         ts.sell(t1);
         ts.sell(t2);
         ts.sell(t3);
         ts.sell(t4);

         System.out.println(ts.getIncomes());

     }
}