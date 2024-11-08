public class Task{

    private String taskName;
    private Priority priority;

    public Task(String taskName, Priority priority){
        this.taskName = taskName;
        this.priority = priority;
    }

    public void displayTask(){
        System.out.println("Task Name: " + taskName + ", " + priority.getDescription());
    }

}
