import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("過去問解決", LocalDate.of(2026,10,20)));
        tasks.add(new Task("運動する", LocalDate.of(2026, 10, 17)));

        System.out.println("--- 編集前のタスク一覧 ---");
        for(int i=0; i<tasks.size(); i++){
            System.out.println("[" + i + "]");
            tasks.get(i).showTasks();
        }        

        int targetIndex = 0; 
        System.out.println("\n-> " + targetIndex + "番のタスクを編集します。");

        Task selectedTask = tasks.get(targetIndex);

        selectedTask.editTask("過去問解決", false, LocalDate.of(2026,10,15));
        System.out.println("編集が完了しました！");

         System.out.println("\n--- 編集後のタスク一覧 ---");
        for(Task task : tasks){
            task.showTasks();
        }

        System.out.println(tasks.get(targetIndex).isOverDue());
    }
}
