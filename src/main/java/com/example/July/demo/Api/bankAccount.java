package com.example.July.demo.Api;

public class bankAccount {
    private int AccountNumber;
    private String CustomerName;

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



}
