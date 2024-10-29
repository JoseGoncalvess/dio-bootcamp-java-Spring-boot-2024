package org.dbDigital.domain.models.interfaces;

import org.dbDigital.domain.models.Account;

public interface Iaccount {
    public void withdraw(double  value);
    public void transfer(double  value, Account accoutdest); // cont destino
    public void deposit(double  value);

    public  void printextract();
}
