import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserStory userStory1 = new UserStory(1, "The 'subtraction' function in the calculator.", 3, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "The 'division' function in the calculator.", 6, new ArrayList<>());

        Bug bug1 = Bug.createBug(1, "The 'subtraction' function bug.", 1, userStory1);
        Bug bug2 = Bug.createBug(2, "The 'division' function bug.", 3, userStory2);

        Sprint sprint = new Sprint(15, 6);

        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);

        sprint.addBug(bug1);
        sprint.addBug(bug2);

        List <Bug> bugs = new ArrayList<>();
        bugs.add(bug1);
        bugs.add(bug2);

        for (Bug bug : bugs) {
            System.out.println(bug);
        }

        List<Ticket> sprintTickets = sprint.getTickets();
        for (Ticket ticket : sprintTickets) {
            System.out.println(ticket);
        }

        System.out.println("Total estimate of the sprint: " + sprint.getTotalEstimate());
    }  
}
