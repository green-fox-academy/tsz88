package com.example.printer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Task3Controller {

  @RequestMapping("/useful")
  public String mainPage(){
    return "mainpage";
  }

  @GetMapping("/useful/colored")
  public String backgroundColorPage(UtilityService utilityService, Model model){
    model.addAttribute("backgroundColor", utilityService.randomColor());
    return "coloredbackgrounds";
  }

  @GetMapping("useful/email")
  public String emailValidityCheck(@RequestParam("email")String email, Model model){
     model.addAttribute("emailAddress", email);
     if(UtilityService.validateEmail(email)){
       model.addAttribute("textcolor", "green");
       model.addAttribute("text", " is a valid email address.");
     } else {
       model.addAttribute("textcolor", "red");
       model.addAttribute("text"," is an invalid email address.");
     }
     return "email";
  }

  @GetMapping("/useful/caesarencoder/{shift}/{text}")
  public String encoder(@PathVariable("shift") int shift, @PathVariable("text") String text){

    return "caesarencoder";
  }

}
