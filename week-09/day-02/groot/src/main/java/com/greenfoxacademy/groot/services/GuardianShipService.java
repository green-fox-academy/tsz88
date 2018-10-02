package com.greenfoxacademy.groot.services;

import com.greenfoxacademy.groot.models.NewLoadForSpaceShip;
import com.greenfoxacademy.groot.models.SpaceShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardianShipService {

  private double maxCargo = 12500;

  public void loadShip(NewLoadForSpaceShip load, SpaceShip spaceShip){
    if (load.getReceived().equals(".25")){
      spaceShip.setCaliber25(spaceShip.getCaliber25()+load.getAmount());
    }
    if (load.getReceived().equals(".30")){
      spaceShip.setCaliber30(spaceShip.getCaliber30()+load.getAmount());
    }
    if (load.getReceived().equals(".50")){
      spaceShip.setCaliber50(spaceShip.getCaliber50()+load.getAmount());
    }
    updateShipStatus(spaceShip);
    updateReadyBoolean(spaceShip);
  }

  public void updateShipStatus(SpaceShip spaceShip){
    double currentStatusInt = (spaceShip.getCaliber25()
                                + spaceShip.getCaliber30()
                                + spaceShip.getCaliber50())
                                / maxCargo * 100;
    if (currentStatusInt == 0){
      spaceShip.setShipstatus("empty");
    }
    if (currentStatusInt > 0 ) {
      spaceShip.setShipstatus(currentStatusInt + "%");
    }
    if (currentStatusInt == 100) {
      spaceShip.setShipstatus("full");
    }
    if (currentStatusInt > 100){
      spaceShip.setShipstatus("overloaded");
    }
  }

  public void updateReadyBoolean(SpaceShip spaceShip){
    spaceShip.setReady(spaceShip.getShipstatus().equals("full"));
  }
}
