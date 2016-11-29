package app.todo;

import org.hibernate.validator.constraints.NotBlank;

public class Todo {

    private static int count = 1;

    private int id;

    @NotBlank
    private String description;

    private TodoStatus status=TodoStatus.TODO;

    public Todo(String description) {
        this.id = count++;
        this.description = description;
    }

    public Todo(int id) {
        this.id = id;
    }

    public Todo() {
        this.id = count++;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TodoStatus getStatus() {
        return status;
    }

    public void setStatus(TodoStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;

        return id == todo.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
