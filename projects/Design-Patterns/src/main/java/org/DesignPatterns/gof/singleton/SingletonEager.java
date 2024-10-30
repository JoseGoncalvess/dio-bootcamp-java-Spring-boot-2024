package org.DesignPatterns.gof;

public class SingletonEager {
    private  static  SingletonEager intance = new SingletonEager();

    private SingletonEager(){
    }

    public  static  SingletonEager getInstance(){
        return  intance;

    }

}
