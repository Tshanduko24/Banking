package com.bankingapplication.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/account")
public class AccountController {

    @Autowired
    AccountService accountService;

     @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping("/account/{id_number}")
    public Account getAccountByAccNum(@PathVariable(value = "id_number") int id_number) {
        return accountService.getAccountByAccNum(id_number);
    }
    @DeleteMapping("/accounts/{id_number}")
    public void deleteEmployee(@PathVariable("id_number") int id) {
        accountService.deleteAccountById(id);
    }
    @PostMapping("/employee")
    public void addEmployee(@RequestBody Account account) {
        accountService.saveOrUpdate(account);
    }
    @PutMapping("/employee")
    public void updateEmployee(@RequestBody Account employee) {
        accountService.saveOrUpdate(employee);
    }




//    private final AccountService accountService;
//    @Autowired
//    public AccountController(AccountService accountService) {
//        this.accountService = accountService;
//    }
//
//    @GetMapping
//    public String getName()
//    {
//        return accountService.name();
//    }
//
//    @PostMapping
//    public ResponseEntity<String> createAccount(@RequestBody Account accounts) {
//        return accountService.createAccount(accounts);
//    }


}
