package org.example;

public class Enterprise extends Account{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double basePrice = insurance.getPrice();
        insurance.setPrice(basePrice * 1.20);
        insuranceList.add(insurance);
        System.out.println("Kurumsal müşteri için sigorta eklendi: " + insurance.getInsuranceName());

    }
}
