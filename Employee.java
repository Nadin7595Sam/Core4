import java.util.List;
import java.util.ArrayList;

public class Employee {
    private String name;
    private int id;
    private List<Task> tasks = new ArrayList<>();

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public int getId() {
        return id;
    }
}