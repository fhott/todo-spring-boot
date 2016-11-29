package app.todo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private static List<Todo> list = new ArrayList<>();

    static {
        list.add(new Todo("Teste 01"));
        list.add(new Todo("Teste 02"));
        list.add(new Todo("Teste 03"));
        list.add(new Todo("Teste 04"));
    }

    @GetMapping
    public List<Todo> find() {
        return list;
    }

    @GetMapping("/{id}")
    public Todo findOne(@PathVariable int id) {
        return list.stream().filter(e -> e.getId() == id).findFirst().get();
    }

    @PostMapping
    public Todo add(@RequestBody @Validated Todo todo) {
        list.add(todo);
        return todo;
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable int id, @RequestBody @Validated Todo todo) {
        todo.setId(id);
        int index = list.indexOf(todo);
        list.set(index, todo);
        return todo;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        list.remove(new Todo(id));
    }

}
