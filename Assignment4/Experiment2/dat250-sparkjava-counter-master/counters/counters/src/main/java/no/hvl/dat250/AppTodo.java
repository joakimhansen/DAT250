package no.hvl.dat250;

import static spark.Spark.*;

public class AppTodo {

    static Todo todos = null;

    public static void main(String[] args) {

        if (args.length > 0) {
            port(Integer.parseInt(args[0]));
        } else {
            port(8080);
        }

        todos = new Todo();

        after((req, res) -> {
            res.type("application/json");
        });

        get("/todos", (req, res) -> todos.toJson());

    }

}