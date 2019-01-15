package com.shelter.arvacska.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArvacskaController {

  @GetMapping("/")
  public String mainPageDisplay(Model model){
    return "main";
  }

  @GetMapping("/uj-allatka")
  public String ujAllatkaHozzaadas(){
    return "uj_allatka";
  }

  @RequestMapping("/allatkak")
  public String allatkaListDisplay(Model model){

    return "allatka";
  }
}
