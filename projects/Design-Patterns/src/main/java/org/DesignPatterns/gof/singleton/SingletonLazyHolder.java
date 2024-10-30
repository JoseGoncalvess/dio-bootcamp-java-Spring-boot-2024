package org.DesignPatterns.gof;

public class SingletonLazyHolder {
   static  class  instanceHolder{
       public   static  SingletonLazyHolder intance = new SingletonLazyHolder();
   }


    private SingletonLazyHolder(){
    }

    public  static  SingletonLazyHolder getInstance(){
        return  instanceHolder.intance;

    }

}
