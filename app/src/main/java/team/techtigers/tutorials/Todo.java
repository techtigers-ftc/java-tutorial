package team.techtigers.tutorials;

/**
 * Represents a todo item.
 */
public class Todo {
    private String title;
    private TodoState state;

    /**
     * Creates a new todo item with the given title. The item is defaulted to
     * the OPEN state.
     *
     * @param title The title of the todo item.
     */
    public Todo(String title) {
        this.title = title;
        this.state = TodoState.OPEN;
    }

    /**
     * Gets the title of the todo item.
     * @return The title of the todo item.
     */
    @Getter
    public String getTitle() {
        return title;
    }

    /**
     * Returns a parameter that indiciates whether the todo item is still open.
     * @return True if the todo item is open, false otherwise.
     */
    @Getter
    public boolean isOpen() {
        return state == TodoState.OPEN;
    }

    /**
     * Updates the title of the todo item.
     * @param title The new title of the todo item.
     */
    @NonNull
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Marks the todo item as completed.
     */
    public void complete() {
        state = TodoState.COMPLETED;
    }

    /**
     * Marks the todo item as abandoned.
     */
    public void abandon() {
        state = TodoState.ABANDONED;
    }

    /**
     * Reopens the todo item.
     */
    public void reopen() {
        state = TodoState.OPEN;
    }
}
