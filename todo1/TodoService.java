package todo1;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void add(String title) {
        if(title == null) return;
        
        title = title.trim();

        if(title.isEmpty()) return;
        

       Task task = new Task(nextId, title);
       tasks.add(task);
       nextId++;

    }

    public void list() {
        for(Task task : tasks) {
            if (!task.isDone()) {
                System.out.println("[ ]" + " " + task.getId() + " " + task.getTitle());
            }
        }

        for(Task task : tasks) {
            if(task.isDone()) {
                System.out.println("[x]" + " " + task.getId() + " " + task.getTitle());
            }
        }
    }

    public void done(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markDone();
                return;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId() == id) {
                tasks.remove(i);
            }
        }
    }
}
