package com.greenfoxacademy.springstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringstarApplication {

  public static void main(String[] args) {

    SpringApplication.run(SpringstarApplication.class, args);


  }


  @RequestMapping(value = "/hello")
  @ResponseBody
  public String helloWorld() {
    return "Hello World!";
  }
}
