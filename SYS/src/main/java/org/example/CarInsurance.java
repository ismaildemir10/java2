package org.example;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName, double price, Date startDate, Date endDate) {
        super(insuranceName, price, startDate, endDate);
    }
    @Override
    public double calculate() {
        return price*1.20;
    }
}
