package no.hvl.dat250.jpa.bankingsystem;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "banking";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select p from Person p");
        List<Person> personList = q.getResultList();
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("Size: " + personList.size());

        // create 5 new persons with addresses
//        em.getTransaction().begin();
//        for (int i=0; i<5; i++) {
//            Person person = new Person();
//            person.setName(nameGenerator());
//
//            Address address = new Address();
//            address.setStreet(streetGenerator());
//            address.setNumber(numberGenerator());
//            person.setAddress(address);
//
//            em.persist(person);
//        }
//        em.getTransaction().commit();
//        em.close();

        // create 1 new person with address
//        em.getTransaction().begin();
//        Person person = new Person();
//        person.setName(nameGenerator());
//        person.addAddress(streetGenerator(), numberGenerator());
//        em.persist(person);
//        em.getTransaction().commit();
//        em.close();

    }

    public static String nameGenerator() {
        Random r = new Random();
        String[] names = {"Ole", "Geir", "Per", "Lise", "Marie", "Magnus", "Torstein", "Andrea", "Julie"};
        return names[r.nextInt(names.length)];
    }

    public static String streetGenerator() {
        Random r = new Random();
        String[] streets = {"Parkveien", "Fjøsangerveien", "Kanalveien", "Bergensveien", "Bryggen", "Minde", "Sentrum", "Flåten", "Nestun"};
        return streets[r.nextInt(streets.length)];
    }

    public static int numberGenerator() {
        Random r = new Random();
        return r.nextInt(50);
    }
}
