package org.dbDigital.domain.models;

import java.util.ArrayList;

public class Bank {
    private String name;
    private  String CNPJ;
   private Address address;



    private ArrayList<Account> accoutsBank = new ArrayList<>();

    public Bank(String name, String CNPJ, Address address) {
        this.name = name;
        this.CNPJ = CNPJ;
        this.address = address;
    }


    public String getName() {
        return name;
    }



    public String getCNPJ() {
        return CNPJ;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Account> getAccoutsBank() {
        return accoutsBank;
    }

    public void setNewAccoutsBank(Account newAccoutsBank) {
        this.accoutsBank.add(newAccoutsBank);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", address=" + address +
                ", accoutsBank=" + accoutsBank +
                '}';
    }
}
