import java.util.LinkedList;

public class UserStory extends Ticket {

    private LinkedList<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, LinkedList<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies != null ? dependencies : new LinkedList<>();
    }

    public UserStory(int id, String name, int estimate) {
        super(id, name, estimate);
        this.dependencies = new LinkedList<>();
    }

    @Override
    public void complete() {
        for (UserStory userStory : dependencies) {
            if (!userStory.isCompleted()) return;
        }
        super.complete();
    }

    public LinkedList<UserStory> getDependencies() {
        return new LinkedList<>(dependencies);
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
