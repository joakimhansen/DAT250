package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "lives",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    Set<Address> addresses;

    //@JoinColumn(name="creditCard_id")
//    @OneToMany(mappedBy = "id")
//    @JoinColumn(name="creditCard_id")

    @OneToMany
    @JoinColumn(name = "id")
    private Set<CreditCard> creditCards;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Address> getAddress() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Person: [name=" + getName() + "]";
    }


}