package no.hvl.dat250;

import com.google.gson.Gson;

import java.util.List;

import static spark.Spark.*;

public class AppTodo {

    static TodoDAO dao = new TodoDAO();

    public static void main(String[] args) {

        if (args.length > 0) {
            port(Integer.parseInt(args[0]));
        } else {
            port(8080);
        }

        after((req, res) -> {
            res.type("application/json");
        });

        // GET todos
        get("/todos", (req, res) -> {
            List<Todo> todos = dao.getTodo();
            Gson gson = new Gson();
            return gson.toJson(todos.toArray());
        });

        // GET todo
        get("/todos", (req, res) -> {
            return dao.getTodo(Integer.parseInt(req.params(":id"))).toJson();
        });

        // POST
        post("/todos", (req, res) -> {
            Gson gson = new Gson();
            Todo todo = gson.fromJson(req.body(), Todo.class);
            dao.createTodo(todo);
            return "New todo created: " + todo.toJson();
        });

        // PUT
        put("/todos", (req, res) -> {
            Gson gson = new Gson();
            Todo todo = gson.fromJson(req.body(), Todo.class);
            dao.updateTodo(todo);
            return "Updated todo: " + todo.toJson();
        });

        // DELETE
        delete("/todos", (req, res) -> {
            dao.deleteTodo(Integer.parseInt(req.params(":id")));
            return "Deleted todo, id=" + Integer.parseInt(req.params(":id"));
        });
    }
}