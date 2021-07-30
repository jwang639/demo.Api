package com.example.July.demo.Api;

import java.util.ArrayList;

public interface bankAccountDao {
    public void addAccount(bankAccount bankAccount);
    public void updateName(String oldName, String newName);
    public void deleteAccount(int accountNumber);
    public ArrayList<bankAccount> getAccount();
}
