package com.greenfoxacademy.springstar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWEBController {

  AtomicLong loadedTheSiteThisManyTimes = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam("name")String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("counter",loadedTheSiteThisManyTimes.incrementAndGet());
    return "greeting";
  }
}
