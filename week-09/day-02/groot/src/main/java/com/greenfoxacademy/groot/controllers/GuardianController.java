package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.models.ErrorMessages;
import com.greenfoxacademy.groot.models.GrootDictionary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object grootTranslator(@RequestParam(value = "message", required = false) String message){
    if (message == null){
      return new ErrorMessages("groot");
    }
    else {
      return new GrootDictionary(message);
    }
  }
}
