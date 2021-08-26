public class Task {
    protected String description;
    protected boolean isDone;
    protected Instruction type;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.type = Instruction.EMPTY;
    }
    
    public Task(String description, Instruction type) {
        this.description = description;
        this.isDone = false;
        this.type = type;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }
    
    public Instruction getInstructionType() {
        return type;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + description;
    }
}
