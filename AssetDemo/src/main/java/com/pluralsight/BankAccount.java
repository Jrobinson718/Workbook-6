package com.pluralsight;

public class BankAccount {

    public double balance;

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getValue() {
        return balance;
    }
}
