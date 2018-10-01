package com.greenfoxacademy.restday01.controllers;

import com.greenfoxacademy.restday01.models.*;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

  @GetMapping("appenda/{appendable}")
  public Object appender(@PathVariable(value = "appendable", required = true) String text){
    return new Appender(text);
  }

  @PostMapping("/dountil/{action}")
  public Object recursionIsLife(@PathVariable(value = "action") String action, @RequestBody(required = false) Until untilObject){
    if (untilObject == null){
      return new ErrorObject("dountil");
    }
    int until = untilObject.getUntil();
    NumberForDoUntil x = new NumberForDoUntil(action,until);
    return x;
  }
}
