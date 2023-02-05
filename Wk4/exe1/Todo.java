// add code here
public class Todo extends Task {
    private boolean isDone = false;

    public Todo(String description) {
        super(description);
    }
    
    public boolean isDone() {
        return isDone;
    }
    
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}
