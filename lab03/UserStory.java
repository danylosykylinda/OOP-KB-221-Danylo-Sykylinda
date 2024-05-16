import java.util.ArrayList;
import java.util.List;

public class UserStory extends Ticket{
    final private List <UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List <UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies;
    }

    public List <UserStory> getDependencies() {
        return new ArrayList<> (dependencies);
    }

    @Override
    public boolean complete() {
        for (Ticket ticket : this.dependencies) {
            if (!ticket.isCompleted()){
                return false;
            }
        }
        super.complete();
        return true;
}

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
