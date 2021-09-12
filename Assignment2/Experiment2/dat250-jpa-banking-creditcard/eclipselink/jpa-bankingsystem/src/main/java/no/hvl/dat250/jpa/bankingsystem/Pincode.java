package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pincode;
    private int count;


}
