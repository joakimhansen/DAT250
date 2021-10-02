package no.hvl.dat250;

// GET /todo
// PUT /todo/:id
// DELETE /todo/:id

import com.google.gson.Gson;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class Todo {

//    private AtomicLong idd = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String summary;
    private String description;

    String toJson() {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(this);
        return jsonInString;
    }

    @Override
    public String toString() {
        return "Todo [summary=" + summary + ", description=" + description + "]";

    }
}
