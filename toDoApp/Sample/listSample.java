import java.util.List;
import java.util.ArrayList;

public class listSample {

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();

        tasks.add("課題解決");
        tasks.add("運動する");
        tasks.add("牛乳を飲む");

        System.out.println("件数: " + tasks.size());

        System.out.println(tasks.get(0));

        for (String task : tasks) {
            System.out.println(task);
        }

        tasks.remove(2);

        for (String task : tasks) {
            System.out.println(task);
        }

        System.out.println(tasks.size());

    }

}