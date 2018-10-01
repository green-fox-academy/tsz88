package com.greenfoxacademy.restday01.controllers;

import com.greenfoxacademy.restday01.models.ErrorObject;
import com.greenfoxacademy.restday01.models.NumbersForPlaying;
import com.greenfoxacademy.restday01.models.WelcomeMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubler(@RequestParam(value = "input", required = false) Integer input){
    if (input == null){
      return new ErrorObject("doubler");
    } else {
      NumbersForPlaying current = new NumbersForPlaying(input);
      return current;
    }
  }

  @GetMapping("/greeter")
  public Object greeterMethod(@RequestParam Map<String,String> params){
    String name = params.get("name");
    String title = params.get("title");
    if (name == null) {
      return new ErrorObject("greeterNoName");
    }
    else if (title == null) {
      return new ErrorObject("greeterNoTitle");
    }
    else {
      return new WelcomeMessage(name, title);
    }
  }
}
