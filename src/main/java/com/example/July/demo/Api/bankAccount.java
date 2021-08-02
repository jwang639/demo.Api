package com.example.July.demo.Api;

public class bankAccount {
    private int AccountNumber;
    private String CustomerName;
    private String Email;
    private int Phone;
    private double balance;

    bankAccount(){}

    bankAccount(int accountNumber, String customerName) {
        AccountNumber = accountNumber;
        CustomerName = customerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
