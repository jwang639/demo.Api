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

    @GetMapping("/getAccount")
    public ArrayList<bankAccount> hello(){
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
        public String update(@PathVariable("newName") String newName,
                             @PathVariable("oldName") String oldName){
            User.updateName(oldName, newName);
            return oldName+" is updated to new name: "+ newName;
    }

    @DeleteMapping("/deleteAccount/{number}")
    public String deleteAccount(@PathVariable("number") int accountNumber){
        User.deleteAccount(accountNumber);
        return accountNumber+ " is deleted";
    }

}
