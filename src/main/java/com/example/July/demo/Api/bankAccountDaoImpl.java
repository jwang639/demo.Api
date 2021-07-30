package com.example.July.demo.Api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class bankAccountDaoImpl implements bankAccountDao{

    ArrayList<bankAccount> Bank= new ArrayList<>();

    bankAccountDaoImpl() {
        bankAccount test1= new bankAccount();
        test1.setAccountNumber(123);
        test1.setCustomerName("jiahao");
        this.addAccount(test1);
    }

    @Override
    public void addAccount(bankAccount bankAccount) {
        Bank.add(bankAccount);
    }

    @Override
    public void updateName(String oldName, String newName) {
        for(bankAccount bankAccount: Bank){
            if(bankAccount.getCustomerName().equals(oldName)){
                bankAccount.setCustomerName(newName);
                System.out.println("Your name is updated");
            }
        }

    }

    @Override
    public void deleteAccount(int accountNumber) {
        for(bankAccount bankAccount: Bank){
            if(bankAccount.getAccountNumber()== accountNumber)
                Bank.remove(bankAccount);
        }
    }

    @Override
    public ArrayList<bankAccount> getAccount() {
        return Bank;
    }
}
