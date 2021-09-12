package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "persons", cascade = CascadeType.PERSIST)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "persons", cascade = CascadeType.PERSIST)
    private List<CreditCard> creditCards = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddress() {
        return addresses;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }


    @Override
    public String toString() {
        return "Person: [name=" + getName() + "]";
    }


}