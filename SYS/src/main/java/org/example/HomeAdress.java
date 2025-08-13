package org.example;

public class HomeAdress implements Address {
    private String city;

    public HomeAdress(String city) {
        this.city = city;
    }

    @Override
    public String getCity() {
        return city;
    }
    @Override
    public String getType() {
        return "Ev adresi";
    }

    @Override
    public String toString() {
        return getType()+city;
    }
}
