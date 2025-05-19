package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Portfolio p = new Portfolio("Johnathan's portfolio", "Johnathan Robinson");
        CreditCard creditCard1 = new CreditCard();
        creditCard1.charge(2000);

        p.add(new Gold(3));
        p.add(new Jewelry("Necklace", 2));
        p.add(new House(2023, 4000, 3));
        p.add(creditCard1);

        System.out.println("The total value of the portfolio is " + p.getValue());
    }
}