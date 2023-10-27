public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John");
        Employee employee2 = new Employee(2, "Alice");
        Employee employee3 = new Employee(3, "Bob");

        Task task1 = new Task("Task 1", 1);
        Task task2 = new Task("Task 2", 2);
        Task task3 = new Task("Task 3", 3);

        TaskPlanner planner = new TaskPlanner();
        planner.addEmployee(employee1);
        planner.addEmployee(employee2);
        planner.addEmployee(employee3);

        planner.addTask(task1);
        planner.addTask(task2);
        planner.addTask(task3);

        planner.assignTasksAutomatically();

        for (Employee employee : planner.getEmployees()) {
            System.out.println("Employee " + employee.getId() + ":");
            for (Task task : employee.getTasks()) {
                System.out.println("  - Task " + task.getPriority() + ": " + task.getTitle());
            }
        }
    }
}