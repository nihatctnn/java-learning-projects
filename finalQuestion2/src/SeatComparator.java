import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SeatComparator implements Comparator<Ticket>
{

    @Override
    public int compare(Ticket t1, Ticket t2)
     {
        return t1.seatNumber - t2.seatNumber;
     }

    void SortAndPrint(List<Ticket> tickets)
     {
         SeatComparator seatComp = new SeatComparator();
         Collections.sort(tickets, seatComp);

         for(Ticket t : tickets)
          {
              t.print();
          }

     }

}