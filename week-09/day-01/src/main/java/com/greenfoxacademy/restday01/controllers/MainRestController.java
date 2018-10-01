package com.greenfoxacademy.restday01.controllers;

import com.greenfoxacademy.restday01.models.ErrorObject;
import com.greenfoxacademy.restday01.models.NumbersForPlaying;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubler(@RequestParam(value = "input", required = false) Integer input){
    if (input == null){
      return new ErrorObject();
    } else {
      NumbersForPlaying current = new NumbersForPlaying(input);
      return current;
    }
  }
}
