import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Ticket> base = new ArrayList<>();
        base.add(new Ticket(21, 1, new GregorianCalendar(2022, Calendar.FEBRUARY, 25)));
        base.add(new Ticket(21, 2, new GregorianCalendar(2022, Calendar.FEBRUARY, 25)));
        base.add(new Ticket(21, 3, new GregorianCalendar(2022, Calendar.FEBRUARY, 25)));
        base.add(new Ticket(21, 1, new GregorianCalendar(2022, Calendar.FEBRUARY, 26)));

        Customer customer = new Customer(1, new ArrayList<>(),
                new CashProvider(12404164, 1000, 0), new TicketProvider());

        customer.cash.authorization(customer);
        customer.buyTicket(base.get(0));
        System.out.println(customer.tickets.size());
        System.out.println(customer.cash.balance);
    }
}

