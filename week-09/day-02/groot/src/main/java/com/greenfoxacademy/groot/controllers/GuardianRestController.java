package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.models.*;
import com.greenfoxacademy.groot.services.GuardianShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GuardianRestController {

  @Autowired
  GuardianShipService guardianShipService;
  SpaceShip rorasSpaceShip = new SpaceShip();

  @GetMapping("/groot")
  public Object grootTranslator(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      return new ResponseEntity(new ErrorMessages("groot"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity(new GrootDictionary(message), HttpStatus.OK);
    }
  }

  @GetMapping("/yondu")
  public Object yondusArrow(
      @RequestParam(value = "distance") Double distance,
      @RequestParam(value = "time") Double time) {
    if (distance == null || time == null) {
      return new ResponseEntity(new ErrorMessages(), HttpStatus.BAD_REQUEST);
    } else {
      return new YonduSpeedCalculator(distance, time);
    }
  }

  @GetMapping("/rocket")
  public Object rorasCargo() {
    return rorasSpaceShip;
  }

  @GetMapping("/rocket/fill")
  public Object loadTheShip(
      @RequestParam(value = "caliber", required = false) String caliber,
      @RequestParam(value = "amount", required = false) Integer amount) {

    if (caliber == null || amount == null) {
      return new ResponseEntity("No caliber or amount specified.", HttpStatus.BAD_REQUEST);
    }
    NewLoadForSpaceShip load = new NewLoadForSpaceShip(caliber, amount);
    guardianShipService.loadShip(load, rorasSpaceShip);
    ShipStatusReport currentStatusReport = new ShipStatusReport(rorasSpaceShip, load);
    return currentStatusReport;
  }
}
