package org.example;

public class BusinessAdress implements Address{
    String city;
    String company;

    public BusinessAdress(String city, String company) {
        this.city = city;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getType() {
        return "İş adresi "+company;
    }

    @Override
    public String toString() {
        return getType() + " "+city;
    }
}
