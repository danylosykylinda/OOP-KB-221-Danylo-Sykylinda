import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int capacity;
    private int ticketLimit;
    private List <Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory != null && !userStory.isCompleted() && !(getTotalEstimate() + userStory.getEstimate() > capacity) && !(tickets.size() >= ticketLimit)) {
            tickets.add(userStory);
            return true;
        }
        return false;
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport != null && !bugReport.isCompleted() && !(getTotalEstimate() + bugReport.getEstimate() > capacity) && !(tickets.size() >= ticketLimit)) {
            tickets.add(bugReport);
            return true;
        }
        return false;
    }

    public List <Ticket> getTickets()  {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int totalEstimateTime = 0;
        for (Ticket ticket : tickets) {
            totalEstimateTime += ticket.getEstimate();
        }
        return totalEstimateTime;
    }
}
