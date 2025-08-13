package org.example;

import java.util.Date;

public abstract class Insurance {
    protected String insuranceName;
    protected double price;
    protected Date startDate;
    protected  Date endDate;

    public Insurance(String insuranceName, double price, Date startDate, Date endDate) {
        this.insuranceName = insuranceName;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getInsuranceName() {return insuranceName;}
    public double getPrice() {return price;}
    public Date getStartDate() {return startDate;}
    public Date getEndDate() {return endDate;}

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculate();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                ", ücret=" + price +
                ", başlama tarihi=" + startDate +
                ", bitiş  tarihi=" + endDate +
                '}';
    }
}
