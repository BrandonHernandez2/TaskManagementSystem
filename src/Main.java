import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Dishes", Priority.MEDIUM));
        tasks.add(new Task("Food", Priority.HIGH));
        tasks.add(new Task("Play Game", Priority.LOW));
        tasks.add(new Task("Sports", Priority.MEDIUM));
        tasks.add(new Task("Shower", Priority.HIGH));
        tasks.sort();
    }
}

