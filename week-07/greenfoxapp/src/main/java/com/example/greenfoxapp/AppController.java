package com.example.greenfoxapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

  @RequestMapping("/gfa")
  public String indexPageData(Model model){

  }
}
