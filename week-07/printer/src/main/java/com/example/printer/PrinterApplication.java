package com.example.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(PrinterApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    newColor.printColor();
  }


  @Autowired
  private Printer printer;

  @Autowired
  private MyColor newColor;
}
