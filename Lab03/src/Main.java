import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        UserStory us1 = new UserStory(1, "Login feature", 3);
        UserStory us2 = new UserStory(2, "Registration feature", 4);

        LinkedList<UserStory> deps = new LinkedList<>();
        deps.add(us1);
        UserStory us3 = new UserStory(3, "Profile update", 2, deps);

        us1.complete();
        us3.complete(); 
        us2.complete(); 

        us3.complete();

        Bug bug1 = Bug.createBug(101, "Login fails on special chars", 2, us1); 
        Bug bug2 = Bug.createBug(102, "Registration timeout", 3, us2); 
        Bug bug3 = Bug.createBug(103, "Profile crash", 1, us3); 

        Sprint sprint = new Sprint(10, 5);

        sprint.addUserStory(us1); 
        sprint.addUserStory(us2); 
        sprint.addUserStory(us3); 
        sprint.addBug(bug1);     
        sprint.addBug(bug2);    
        sprint.addBug(bug3);      

        System.out.println("=== Tickets in Sprint ===");
        for (Ticket ticket : sprint.getTickets()) {
            System.out.println(ticket);
        }

        System.out.println("\nTotal estimate: " + sprint.getTotalEstimate());
    }
} 
