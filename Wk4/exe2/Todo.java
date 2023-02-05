public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        isDone = false;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        String res = "";
        res = res + "description: " + description + "\n";
        res = res + "is done? " + (isDone ? "Yes" : "No");
        return res;
    }
}
