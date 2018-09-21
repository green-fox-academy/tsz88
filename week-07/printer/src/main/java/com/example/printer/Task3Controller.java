package com.example.printer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("useful/caesarencoder/")
  public String something(){
    return "caesarencoder";
  }

  @GetMapping(value="prettyCaesarCipher")
  public String prettyfied(Model model){

    String encoded = UtilityService.encode(secretmessage, offset);
    model.addAttribute("outputJibberish", encoded);
    return "pretty2/?encoded=" + encoded;
  }

  @GetMapping(value="pretty2")
  public String pretty2(@RequestParam String encoded, Model model){
    model.addAttribute("encodedMessage", encoded);
    return "pretty2";
  }

  @RequestMapping("/useful/caesarencoder/{shift}/{text}")
  public String encoder(@PathVariable("shift") int shift, @PathVariable("text") String text, Model model){
    if (text.length() > 0){
    model.addAttribute("encodedText", UtilityService.encodeCeasarCode(shift,text));} else {
      model.addAttribute("encodedText", "There is no text provided to encode!");
    }
    return "caesarencoder";
  }

}
