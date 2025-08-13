package org.example;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceName, double price, Date startDate, Date endDate) {
        super(insuranceName, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        return price*1.15;
    }
}
