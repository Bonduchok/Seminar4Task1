import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TicketProvider {
    public ArrayList<Ticket> getTickets(int raceNumber, GregorianCalendar date, ArrayList<Ticket> ticketBase) {
        ArrayList<Ticket> result = new ArrayList<>();
        for (int i = 0; i < ticketBase.size(); i++) {
            if (ticketBase.get(i).raceNumber == raceNumber && ticketBase.get(i).date.equals(date)) { // проверка на совпаление номера рейса и даты с искомыми, добавление в результат при совпадении
                result.add(ticketBase.get(i));
            }
        }
        return result;
    }

    public boolean updateTicketStatus(Ticket ticket) { // Меняем значение на противоположное
        ticket.isValid = !ticket.isValid;
        return true;
    }
}
