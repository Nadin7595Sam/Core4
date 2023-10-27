public class Task {
    private String title;
    private int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }
}