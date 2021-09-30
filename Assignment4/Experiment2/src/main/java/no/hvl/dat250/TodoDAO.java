package no.hvl.dat250;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TodoDAO {

    private EntityManager em;

    public TodoDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("todos");
        em = emf.createEntityManager();
    }

    // GET
    public List<Todo> getTodo() {
        Query q = em.createQuery("select t from Todo t");
        return q.getResultList();
    }

    // GET from id
    public Todo getTodo(int id) {
        return em.find(Todo.class, id);
    }

    // POST
    public void createTodo(Todo todo) {
        em.getTransaction().begin();
        em.persist(todo);
        em.getTransaction().commit();
    }

    // PUT
    public void updateTodo(Todo todo) {
        em.getTransaction().begin();
        em.merge(todo);
        em.getTransaction().commit();
    }

    // DELETE
    public void deleteTodo(int id) {
        Todo todo = em.find(Todo.class, id);
        em.getTransaction().begin();
        em.remove(todo);
        em.getTransaction().commit();
    }
}
