package org.dbDigital.service;

import org.dbDigital.domain.models.Client;
import org.dbDigital.domain.models.interfaces.Iaccount;

import java.util.Calendar;
import java.util.Date;

public class AccoutService  {

    public Boolean isConnectionSecurity(String password, Client client){
        return password.equals(client.getCpf()) && !password.isEmpty();
    }

    public boolean isHoursofoperation(Date hoursActuali){
        Calendar predefinedTime = Calendar.getInstance();
        predefinedTime.set(Calendar.HOUR_OF_DAY, 17);
        predefinedTime.set(Calendar.MINUTE, 30);
        return  hoursActuali.before(predefinedTime.getTime());
    }


    protected boolean bankIsOpen(Date hoursActuali){
        Calendar predefinedTime = Calendar.getInstance();
        predefinedTime.set(Calendar.HOUR_OF_DAY,8);
        predefinedTime.set(Calendar.MINUTE, 30);
        return hoursActuali.after(predefinedTime.getTime());
    }


}
