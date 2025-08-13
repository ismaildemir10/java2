package org.example;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, double price, Date startDate, Date endDate) {
        super(insuranceName, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        return 0.9;
    }
}
