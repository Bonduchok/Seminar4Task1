import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Customer {
    public int id;
    public ArrayList<Ticket> tickets;
    public CashProvider cash;
    TicketProvider ticketProvider = new TicketProvider();

    public Customer(int id, ArrayList<Ticket> tickets, CashProvider cash, TicketProvider ticketProvider) {
        this.id = id;
        this.tickets = tickets;
        this.cash = cash;
        this.ticketProvider = ticketProvider;
    }

    public ArrayList<Ticket> searchTicket(GregorianCalendar date, int busNumber, ArrayList<Ticket> ticketBase) { // обращение к TicketProvider
        return ticketProvider.getTickets(busNumber, date, ticketBase);
    }

    public boolean buyTicket(Ticket ticket) { // Проверяем, свободно ли место и произведена ли авторизация
        if (ticket.isValid && cash.isAuthorization && cash.balance >= ticket.price) {
            cash.buy(ticket);
            tickets.add(ticket);
            ticketProvider.updateTicketStatus(ticket);
            return true;
        }
        return false;
    }
}
