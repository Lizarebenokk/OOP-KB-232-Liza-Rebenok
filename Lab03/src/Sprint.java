import java.util.ArrayList;

public class Sprint {
    private int capacity;
    private int ticketLimit;
    private ArrayList<Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        if (canAddTicket(userStory)) {
            tickets.add(userStory);
            return true;
        }
        return false;
    }

    public boolean addBug(Bug bugReport) {
        if (canAddTicket(bugReport)) {
            tickets.add(bugReport);
            return true;
        }
        return false;
    }

    private boolean canAddTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted()) {
            return false;
        }
        
        if (tickets.size() >= ticketLimit) {
            return false;
        }
        
        if (getTotalEstimate() + ticket.getEstimate() > capacity) {
            return false;
        }
        
        return true;
    }

    public Ticket[] getTickets() {
        Ticket[] result = new Ticket[tickets.size()];
        return tickets.toArray(result);
    }

    public int getTotalEstimate() {
        int total = 0;
        for (Ticket ticket : tickets) {
            total += ticket.getEstimate();
        }
        return total;
    }
}