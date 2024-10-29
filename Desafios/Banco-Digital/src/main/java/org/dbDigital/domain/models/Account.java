package org.dbDigital.domain.models;

import org.dbDigital.domain.models.interfaces.Iaccount;
import org.dbDigital.service.AccoutService;

import java.util.Date;

public class Account implements Iaccount {
    private  static  final  int NUMBER_BY_AGENCY = 1;
    private  static  int NUMBER_BY_CCOUNT = 1;

    private int number;
    private  Client client;
    private  int agency;
    private double balance;
    private String password;
    public Account(Client client){
        this.client = client;
        this.agency = NUMBER_BY_AGENCY;
        this.balance = 0.00;
        this.number = NUMBER_BY_CCOUNT++;
        this.password = client.getCpf();
    }

    public static int getNumberByCcount() {
        return NUMBER_BY_CCOUNT;
    }


    public int getNumber() {
        return number;
    }


    public Client getClient() {
        return client;
    }


    public int getAgency() {
        return agency;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    @Override
    public void withdraw(double value) {
        AccoutService accoutService = new AccoutService();

        if (accoutService.isConnectionSecurity(this.password, client)){
            if (value<= balance){
                balance -=  value;
            }
        }else {
            System.out.println("Password not incorrect, operation canceled!");
        }


    }

    @Override
    public void transfer(double value,Account accoutdest) {
        AccoutService accoutService = new AccoutService();
        if (accoutService.isConnectionSecurity(this.password, client)){
            this.balance -= value;
            accoutdest.deposit(value);
        }else {
            System.out.println("Password not incorrect, operation canceled!");
        }


    }

    @Override
    public void deposit(double value) {

        AccoutService accoutService = new AccoutService();
        if (accoutService.isHoursofoperation(new Date())){
            if (value != 0){
                balance += value;
            }
        }else {
            System.out.println("After this time it is not possible to deposit");
        }

    }

    @Override
    public void printextract() {
        System.out.println(client);
        System.out.println("============= CURRENT EXTRACT =============");
        System.out.println("Balance in accout: R$ "+ balance);

    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", client=" + client +
                ", agency=" + agency +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
