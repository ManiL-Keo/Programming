import java.time.LocalDate;

public class Task {
    private String title;
    private boolean completed;
    private LocalDate dueDate;

    public Task(String title, LocalDate dueDate){
        this.title = title;
        this.completed = false;
        this.dueDate = dueDate;
    }

    public Task(String title){
        this.title = title;
        this.completed = false;
        this.dueDate = null;
    }

    public void complete(){
        completed = true;
    }

    public void editTask(String newtitle, boolean newCompleted, LocalDate newDueDate){
        this.title = newtitle;
        this.completed = newCompleted;
        this.dueDate = newDueDate;
    }

    public void showTasks(){
        String dateInfo = (dueDate != null? "(期限: " + dueDate +")" : "(期限なし)");
        System.out.println(title + " : " + (completed? "Completed" + dateInfo : "Incomplete" + dateInfo));
    }

    public boolean isOverDue(){

        if(this.dueDate == null){
            return false;
        }
        boolean isOverDue = LocalDate.now().isAfter(dueDate);

        boolean notComplete = !completed;

        return isOverDue && notComplete;
    }
}