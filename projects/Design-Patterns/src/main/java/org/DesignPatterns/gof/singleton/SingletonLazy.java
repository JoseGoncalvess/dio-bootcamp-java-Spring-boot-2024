package org.DesignPatterns.gof;

public class SingletonLazy {

    private  static  SingletonLazy intance;

    private SingletonLazy(){

    }

    public  static  SingletonLazy getInstance(){
        if (intance == null){
                intance = new SingletonLazy();
                    }

        return  intance;

    }
}
