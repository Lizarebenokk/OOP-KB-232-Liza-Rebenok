public class UserStory extends Ticket {
    private UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory[] dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies != null ? dependencies : new UserStory[0];
    }

    public UserStory(int id, String name, int estimate) {
        this(id, name, estimate, null);
    }

    @Override
    public void complete() {
        if (canComplete()) {
            super.complete();
        }
    }

    private boolean canComplete() {
        if (dependencies == null || dependencies.length == 0) {
            return true;
        }

        for (UserStory dependency : dependencies) {
            if (dependency != null && !dependency.isCompleted()) {
                return false;
            }
        }
        return true;
    }

    public UserStory[] getDependencies() {
        UserStory[] copy = new UserStory[dependencies.length];
        System.arraycopy(dependencies, 0, copy, 0, dependencies.length);
        return copy;
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}