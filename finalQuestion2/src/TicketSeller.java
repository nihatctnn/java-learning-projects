import java.util.List;

public class TicketSeller
{

    List <Ticket> tickets;
    private double incomes;

    public TicketSeller(List<Ticket> tickets)
     {
         this.tickets = tickets;
     }

    public void sell(Ticket ticket)
     {
        incomes += ticket.computePrice();
        tickets.remove(tickets);
     }

    public double getIncomes()
     {
        return incomes;
     }

}