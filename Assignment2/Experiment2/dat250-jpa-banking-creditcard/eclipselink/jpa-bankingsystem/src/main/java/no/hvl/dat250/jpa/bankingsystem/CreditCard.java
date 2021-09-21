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

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pincode_id")
    private Pincode pincode;

    @ManyToOne
    private Person persons;

    @ManyToOne
    private Bank bank;


    public void setNumber(int number) {
        this.number = number;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    public int getNumber() {
        return number;
    }

    public int getLimit() {
        return limit;
    }

    public int getBalance() {
        return balance;
    }

    public Pincode getPincode() {
        return pincode;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
