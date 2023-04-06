package com.bankingapplication.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository repository;

    public Account getAccountByAccNum(int id_number){
        return repository.findById(id_number).get();
    }
     public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<Account>();
        repository.findAll().forEach(account -> accounts.add(account));
        return accounts;
     }
    public void saveOrUpdate(Account account) {
        repository.save(account);
    }
    public void deleteAccountById(int id) {
        repository.deleteById(id);
    }



//    public ResponseEntity<String> createAccount(@RequestBody Account accounts){
//
//        return new ResponseEntity<String>("Saving account details: "+ accounts , HttpStatus.OK);
//    }
//
//
//    public String name(){
//
//        return "Tshanduko";
//    }
}
