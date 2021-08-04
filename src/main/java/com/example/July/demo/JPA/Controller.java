package com.example.July.demo.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private JPAAccountRepository JPAService;

    @GetMapping("/allAccount")
    public List<bankAccount> displayAll(){
        return JPAService.findAll();
    }


    @PostMapping("/addAccount")
    public String addAccount(@RequestBody bankAccount bankAccount){
        JPAService.save(bankAccount);
        return bankAccount.getCustomerName()+ "—added";
    }


    @DeleteMapping("/deleteAccount/{ID}")
    public String deleteAccount(@PathVariable("ID") long ID){
        JPAService.deleteById(ID);
        return ID+ "-deleted";
    }

    @GetMapping("/getAccount/{ID}")
    public Optional<bankAccount> getAccount(@PathVariable("ID") long ID){
       return JPAService.findById(ID);
    }


    @PutMapping("/updateName/{ID}/{newName}")
    public String updateName(@PathVariable("ID")long ID, @PathVariable("newName") String newName){
        Optional<bankAccount> bankAccountOptional= JPAService.findById(ID);
        bankAccount bankAccount= bankAccountOptional.get();
        bankAccount.setCustomerName(newName);
        JPAService.save(bankAccount);
        return ID+ " -name updated";
    }

//******************************************************************************
    //Using DAO version below:
//******************************************************************************
    //@Autowired
    //bankAccountDaoImpl User= new bankAccountDaoImpl();

//    @GetMapping("/allAccount")
//    public ArrayList<bankAccount> getAccount(){
//        return User.getAccount();
//    }
//
//    @GetMapping("/add/{num1}/{num2}")
//    public String add(@PathVariable("num1") int number1, @PathVariable("num2") int number2){
//        return "The result is: "+ (number1+ number2);
//    }
//
//    @PostMapping("/addAccount")
//    public String addAccount(@RequestBody bankAccount bankAccount){
//        User.addAccount(bankAccount);
//        return bankAccount.getCustomerName()+ " is added";
//    }
//
//    @PutMapping("/updateName/{oldName}/{newName}")
//        public String updateName(@PathVariable("newName") String newName,
//                             @PathVariable("oldName") String oldName){
//            User.updateName(oldName, newName);
//            return oldName+" is updated to new name: "+ newName;
//    }
//
//    @PutMapping("/updateEmail/{accountNumber}/{newEmail}")
//    public String updateEmail(@PathVariable("accountNumber") int accountNumber,
//                              @PathVariable("newEmail") String newEmail){
//        User.updateEmail(accountNumber, newEmail);
//        return accountNumber+ " 's email is updated";
//    }
//
//
//    @PutMapping("/updatePhone/{accountNumber}/{newPhone}")
//    public String updateEmail(@PathVariable("accountNumber") int accountNumber,
//                              @PathVariable("newPhone") int newPhone){
//        User.updatePhone(accountNumber, newPhone);
//        return accountNumber+ " 's phone number is updated";
//    }
//
//    @GetMapping("/getUser/{accountName}")
//    public bankAccount getUser(@PathVariable("accountName") String accountName){
//        return User.getUser(accountName);
//    }
//
//    @DeleteMapping("/deleteAccount/{number}")
//    public String deleteAccount(@PathVariable("number") int accountNumber){
//        User.deleteAccount(accountNumber);
//        return accountNumber+ " is deleted";
//    }
//
//    @PutMapping("/deposit/{accountNumber}/{amount}")
//    public String deposit(@PathVariable("accountNumber") int accountNumber,
//                          @PathVariable("amount") double amount){
//        User.deposit(accountNumber, amount);
//        return "Deposit succeed";
//    }
//
//    @GetMapping("/displaybalance/{accountNumber}")
//    public String display(@PathVariable("accountNumber") int accountNumber){
//        return "Your account balance: "+ User.displayBalance(accountNumber);
//    }
//**********************************************************************************
}
