package org.example;

public class Indivadual extends Account{
    public Indivadual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double basePrice = insurance.getPrice();
        insurance.setPrice(basePrice * 1.10);
        insuranceList.add(insurance);
        System.out.println("Bireysel müşteri için sigorta eklendi: " + insurance.getInsuranceName());
    }
}
