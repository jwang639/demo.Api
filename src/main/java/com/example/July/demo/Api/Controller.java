package com.example.July.demo.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    bankAccountDaoImpl User= new bankAccountDaoImpl();

    @GetMapping("/allAccount")
    public ArrayList<bankAccount> getAccount(){
        return User.getAccount();
    }

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable("num1") int number1, @PathVariable("num2") int number2){
        return "The result is: "+ (number1+ number2);
    }

    @PostMapping("/addAccount")
    public String addAccount(@RequestBody bankAccount bankAccount){
        User.addAccount(bankAccount);
        return bankAccount.getCustomerName()+ " is added";
    }

    @PutMapping("/updateName/{oldName}/{newName}")
        public String updateName(@PathVariable("newName") String newName,
                             @PathVariable("oldName") String oldName){
            User.updateName(oldName, newName);
            return oldName+" is updated to new name: "+ newName;
    }

    @PutMapping("/updateEmail/{accountNumber}/{newEmail}")
    public String updateEmail(@PathVariable("accountNumber") int accountNumber,
                              @PathVariable("newEmail") String newEmail){
        User.updateEmail(accountNumber, newEmail);
        return accountNumber+ " 's email is updated";
    }


    @PutMapping("/updatePhone/{accountNumber}/{newPhone}")
    public String updateEmail(@PathVariable("accountNumber") int accountNumber,
                              @PathVariable("newPhone") int newPhone){
        User.updatePhone(accountNumber, newPhone);
        return accountNumber+ " 's phone number is updated";
    }

    @GetMapping("/getUser/{accountName}")
    public bankAccount getUser(@PathVariable("accountName") String accountName){
        return User.getUser(accountName);
    }

    @DeleteMapping("/deleteAccount/{number}")
    public String deleteAccount(@PathVariable("number") int accountNumber){
        User.deleteAccount(accountNumber);
        return accountNumber+ " is deleted";
    }

    @PutMapping("/deposit/{accountNumber}/{amount}")
    public String deposit(@PathVariable("accountNumber") int accountNumber,
                          @PathVariable("amount") double amount){
        User.deposit(accountNumber, amount);
        return "Deposit succeed";
    }

    @GetMapping("/displaybalance/{accountNumber}")
    public String display(@PathVariable("accountNumber") int accountNumber){
        return "Your account balance: "+ User.displayBalance(accountNumber);
    }

}
