package no.hvl.dat110.rest.counters;

// GET /todo
// PUT /todo/:id
// DELETE /todo/:id

import com.google.gson.Gson;

public class Todo {
    private String summary;
    private String description;

    public Todo() {
        this.summary = "";
        this.description = "";
    }

    public Todo(String summary, String description) {
        this.summary = summary;
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
