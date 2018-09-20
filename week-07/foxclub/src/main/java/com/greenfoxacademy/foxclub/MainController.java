package com.greenfoxacademy.foxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @RequestMapping("/")
  public String mainPage(@RequestParam(value = "name", required = false) String foxName, Model model){
      model.addAttribute("fox", foxService.findFoxByName(foxName));
//      Fox thisFox = foxService.findFoxByName(foxName);
//      model.addAttribute("name",thisFox.getName());
//      model.addAttribute("food", thisFox.getFood());
//      model.addAttribute("drink", thisFox.getDrink());
//      model.addAttribute("trickNumber", thisFox.getTricks().size());
    return "index";
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }
//(@ModelAttribute(value="foxName") Fox fox){
  @PostMapping("/login")
  public String loginAddsName(@RequestParam(value="name") String name){
    foxService.addToAllFoxList(new Fox(name));
    return "redirect:/?name=" + name;
  }
}
