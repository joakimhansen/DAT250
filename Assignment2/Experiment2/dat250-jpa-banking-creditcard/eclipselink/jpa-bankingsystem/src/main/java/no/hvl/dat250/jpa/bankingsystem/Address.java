package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;
import java.util.Set;

//@Entity
//@Embeddable
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private int number;
    @ManyToMany(mappedBy = "addresses")
    Set<Person> persons;

//    @ManyToMany(mappedBy="address")
//    private List<Person> person;

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


    @Override
    public String toString() {
        return "Address: [street=" + getStreet() + ", number=" + getNumber() + "]";
    }
}
