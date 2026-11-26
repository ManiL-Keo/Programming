import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();

        tasks.add(new Task("レポートを提出する"));
        tasks.add(new Task("Javaの復習をする"));
        tasks.add(new Task("教科書を読む"));

        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }
}
