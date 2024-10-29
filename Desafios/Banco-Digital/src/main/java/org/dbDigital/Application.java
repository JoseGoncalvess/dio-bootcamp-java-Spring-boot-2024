package org.dbDigital;


import org.dbDigital.domain.models.Account;
import org.dbDigital.domain.models.Address;
import org.dbDigital.domain.models.Bank;
import org.dbDigital.domain.models.Client;

public class Application {
    public static void main(String[] args) {
        Bank nubank = new Bank("Nubank","123654",
                new Address("Rº Agamenon Magalhans",569,"Centro Arcoverde","Arcoverde"));

        Account accountPoupenc = new Account(new Client("Gonçalves","45678"));
        Account accountCorrent = new Account(new Client("Anny","98751"));

        nubank.setNewAccoutsBank(accountPoupenc);
        nubank.setNewAccoutsBank(accountCorrent);

        accountPoupenc.deposit(200);

        accountCorrent.deposit(1000);
        accountPoupenc.transfer(10,accountCorrent);

        accountCorrent.printextract();

        accountPoupenc.printextract();


    }
}