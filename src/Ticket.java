import java.util.GregorianCalendar;

public class Ticket {
    public int raceNumber; // rootNumber
    public int seat; // place
    public int price;
    public GregorianCalendar date;
    public boolean isValid;

    public Ticket(int raceNumber, int seat, GregorianCalendar date) {
        this.raceNumber = raceNumber;
        this.seat = seat;
        this.price = 200;
        this.date = date;
        this.isValid = true;
    }
}
