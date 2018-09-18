package com.example.bankofsimba.controllers;

import com.example.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller

public class SimbaController {

  @RequestMapping("/show")
  public String showBankAccount(Model model){
    BankAccount simbas = new BankAccount("Simba",2000, "lion" );
    model.addAttribute("account", simbas);
    return "showbankaccount";
  }

  @RequestMapping("/htmlception")
  public String inception() {
    return "htmlception";
  }

  @RequestMapping("/multipleAccounts")
  public String multi(Model model){
    List<BankAccount> charactersAccountsList = new ArrayList<>(Arrays.asList(
        new BankAccount("Simba", 2000, "lion"),
        new BankAccount("Nala", 1000,"lion"),
        new BankAccount("Shenzi", 200, "hyena"),
        new BankAccount("Zazu", 5000, "red-billed hornbill")));
    model.addAttribute("list",charactersAccountsList);
    return "multiAccount";
  }
}
