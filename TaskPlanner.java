import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class TaskPlanner {
    private Queue<Task> taskQueue = new LinkedList<>();
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void assignTasksAutomatically() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            employees.sort((e1, e2) -> e1.getTasks().size() - e2.getTasks().size());
            Employee employee = employees.get(0);
            employee.addTask(task);
        }
    }

    public void assignTaskManually(Task task, Employee employee) {
        if (employee != null) {
            employee.addTask(task);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}