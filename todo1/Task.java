package todo1;

public class Task {
     private final int id;
     private final String title;
     private boolean done = false;

     public Task(int id, String title) {
        this.id = id;
        this.title = title;
     }

     public int getId() {
        return id;
     }

     public String getTitle() {
        return title;
     }

     public boolean isDone() {
        return done;
     }

     public void markDone() {
        done = true;
     }
}
