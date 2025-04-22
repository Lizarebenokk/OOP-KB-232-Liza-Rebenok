import java.util.LinkedList;

public class Sprint {

    private LinkedList<Ticket> tickets;
    private int maxTime;
    private int maxTickets;

    public Sprint(int maxTime, int maxTickets) {
        this.maxTime = maxTime;
        this.maxTickets = maxTickets;
        this.tickets = new LinkedList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        return canAddTicket(userStory) && tickets.add(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return canAddTicket(bugReport) && tickets.add(bugReport);
    }

    private boolean canAddTicket(Ticket t) {
        return t != null &&
               !t.isCompleted() &&
               t.getEstimate() + getTotalEstimate() <= maxTime &&
               tickets.size() < maxTickets;
    }

    public LinkedList<Ticket> getTickets() {
        return tickets;
    }

    public int getTotalEstimate() {
        return tickets.stream().mapToInt(Ticket::getEstimate).sum();
    }

    public int getMaxTime() {
        return maxTime;
    }

    public int getMaxTickets() {
        return maxTickets;
    }
}
