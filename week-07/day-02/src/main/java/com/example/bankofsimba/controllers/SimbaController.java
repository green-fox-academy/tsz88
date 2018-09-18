package com.example.bankofsimba.controllers;

import com.example.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
