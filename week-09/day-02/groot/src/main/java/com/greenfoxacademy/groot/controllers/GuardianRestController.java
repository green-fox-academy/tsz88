package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.models.ErrorMessages;
import com.greenfoxacademy.groot.models.GrootDictionary;
import com.greenfoxacademy.groot.models.YonduSpeedCalculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GuardianRestController {

  @GetMapping("/groot")
  public Object grootTranslator(@RequestParam(value = "message", required = false) String message){
    if (message == null){
      return new ResponseEntity(new ErrorMessages("groot"), HttpStatus.BAD_REQUEST);
    }
    else {
      return new ResponseEntity(new GrootDictionary(message), HttpStatus.OK);
    }
  }

  @GetMapping("/yondu")
  public Object yondusArrow(
        @RequestParam(value = "distance") Double distance,
        @RequestParam(value = "time") Double time){
    if (distance == null || time == null){
      return new ResponseEntity(new ErrorMessages(), HttpStatus.BAD_REQUEST);
    }
    else {
      return new YonduSpeedCalculator(distance, time);
    }
  }
}
