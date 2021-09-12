package no.hvl.dat250.jpa.bankingsystem;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pincode;
    private int count;

    public String getPincode() {
        return pincode;
    }

    public int getCount() {
        return count;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
