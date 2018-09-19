package com.example.printer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
