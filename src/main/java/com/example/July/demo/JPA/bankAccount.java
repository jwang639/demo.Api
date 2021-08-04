package com.example.July.demo.JPA;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bankAccount {

    @Id
    private Long AccountNumber;
    private String CustomerName;
    private String Email;
    private int Phone;
    private double balance;

    bankAccount(){}

    bankAccount(Long accountNumber, String customerName) {
        AccountNumber = accountNumber;
        CustomerName = customerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public void setAccountNumber(Long accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public Long getAccountNumber() {
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
