package com.greenfoxacademy.springstar.controllers;

import com.greenfoxacademy.springstar.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  public AtomicLong getLoadedThisManyTimes() {
    return loadedThisManyTimes;
  }

  private AtomicLong loadedThisManyTimes = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name")String name) {
    return new Greeting(loadedThisManyTimes.incrementAndGet(),"Hello, " + name + "!");
  }
}
