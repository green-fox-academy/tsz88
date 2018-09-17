package com.greenfoxacademy.springstar.controllers;

import com.greenfoxacademy.springstar.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name")String name) {
    return new Greeting(1,"Hello, " + name + "!");
  }
}
