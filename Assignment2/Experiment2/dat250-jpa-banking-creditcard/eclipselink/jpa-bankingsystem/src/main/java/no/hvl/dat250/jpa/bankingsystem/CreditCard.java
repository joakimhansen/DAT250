package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private int limit;
    private int balance;

    @OneToOne
    @JoinColumn(name = "pincode_id")
    private Pincode pincode;

    //    @ManyToOne
//    @JoinColumn(name="owner_id")


}
