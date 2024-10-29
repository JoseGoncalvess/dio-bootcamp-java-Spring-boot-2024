package org.dbDigital.domain.models;

public class Address {
    private String road;
    private int number;

    private  String neighborhood;
    private String city;

    public Address(String road, int number, String neighborhood, String city) {
        this.road = road;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
