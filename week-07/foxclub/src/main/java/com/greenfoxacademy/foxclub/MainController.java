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
    return "index";
  }

  @GetMapping("/login")
  public String loginPageGet(){
    return "login";
  }
  @PostMapping("/login")
  public String loginPage(@RequestParam(value="name") String name) {
    if (!foxService.allFoxList.containsKey(name)){
      Fox nameFox = new Fox(name);
      foxService.allFoxList.put(name, nameFox);
    }
    return "redirect:/?name=" + name;
  }
//(@ModelAttribute(value="foxName") Fox fox){

}
