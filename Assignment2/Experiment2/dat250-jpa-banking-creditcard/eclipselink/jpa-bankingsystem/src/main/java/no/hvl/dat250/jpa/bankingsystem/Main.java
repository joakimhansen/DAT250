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

        // Creating a person
        em.getTransaction().begin();
        Person person = new Person();
        person.setName("Max Mustermann");

        // Set the address
        Address address = new Address();
        address.setStreet("Inndalsveien");
        address.setNumber(28);
        address.getPersons().add(person);
        person.getAddress().add(address);

        // Add creditcard and pincode
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(12345);
        creditCard.setBalance(-5000);
        creditCard.setLimit(-10000);
        Pincode pincode = new Pincode();
        pincode.setPincode("123");
        pincode.setCount(1);
        creditCard.setPincode(pincode);
        person.getCreditCards().add(creditCard);

        // Add a bank
        Bank bank = new Bank();
        bank.getCreditCards().add(creditCard);


        em.persist(person);
        em.getTransaction().commit();
        em.close();

    }

}
