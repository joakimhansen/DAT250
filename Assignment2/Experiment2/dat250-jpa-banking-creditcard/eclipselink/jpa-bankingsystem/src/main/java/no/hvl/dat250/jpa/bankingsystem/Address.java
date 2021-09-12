package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Embeddable
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private int number;
    @ManyToMany()
    List<Person> persons = new ArrayList<>();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Address: [street=" + getStreet() + ", number=" + getNumber() + "]";
    }
}
