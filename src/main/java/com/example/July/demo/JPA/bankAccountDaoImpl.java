//package com.example.July.demo.JPA;
//
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//
//@Component
//public class bankAccountDaoImpl implements bankAccountDao {
//
//    ArrayList<bankAccount> Bank= new ArrayList<>();
//
//    bankAccountDaoImpl() {
//        bankAccount test1= new bankAccount();
//        //test1.setAccountNumber(123);
//        test1.setCustomerName("jiahao");
//        this.addAccount(test1);
//    }
//
//    @Override
//    public void addAccount(bankAccount bankAccount) {
//        Bank.add(bankAccount);
//    }
//
//    @Override
//    public void updateName(String oldName, String newName) {
//        for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//            if(bankAccount.getCustomerName().equals(oldName)){
//                bankAccount.setCustomerName(newName);
//                System.out.println("Your name is updated");
//            }
//        }
//
//    }
//
//    @Override
//    public void updateEmail(int accountNumber, String newEmail) {
//        for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//            if (bankAccount.getAccountNumber()== accountNumber){
//                bankAccount.setEmail(newEmail);
//                System.out.println("Email updated");
//            }
//            else
//                System.out.println("Account not found");
//        }
//    }
//
//    @Override
//    public void updatePhone(int accountNumber, int newPhone) {
//        for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//            if(bankAccount.getAccountNumber()== accountNumber){
//                bankAccount.setPhone(newPhone);
//                System.out.println("Phone Number updated");
//            }
//            else
//                System.out.println("Account not found");
//        }
//    }
//
//    @Override
//    public bankAccount getUser(String accountName) {
//        for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//            if(bankAccount.getCustomerName().equals(accountName)) {
//                System.out.println("user found");
//                return bankAccount;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void deleteAccount(int accountNumber) {
//        for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//            if(bankAccount.getAccountNumber()== accountNumber)
//                Bank.remove(bankAccount);
//        }
//    }
//
//    @Override
//    public ArrayList<bankAccount> getAccount() {
//        return Bank;
//    }
//
//    @Override
//    public void deposit(int accountNumber, double amount) {
//        if(amount> 5&& amount< 1000){
//            for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//                if(bankAccount.getAccountNumber()== accountNumber){
//                    bankAccount.setBalance(bankAccount.getBalance()+ amount);
//                    System.out.println("Deposit succeed");
//                }
//            }
//        }
//        else System.out.println("Deposit failed, amount is invalid");
//    }
//
//    @Override
//    public double displayBalance(int accountNumber) {
//        for(com.example.July.demo.JPA.bankAccount bankAccount: Bank){
//            if (bankAccount.getAccountNumber()== accountNumber){
//                return bankAccount.getBalance();
//            }
//        }
//        return 0;
//    }
//}
