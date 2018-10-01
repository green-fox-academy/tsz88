package com.greenfoxacademy.restday01.models;

public class NumberForDoUntil {

  int result;

  public NumberForDoUntil(){
  }

  public NumberForDoUntil(String action, int until){
    if (action.equals("sum")){
      result = sumResultInt(until);
    }
    if (action.equals("factor")){
      result = factorResultInt(until);
    }
  }

  public int factorResultInt(int until){
    if (until == 1){
      return 1;
    } else {
      return until * factorResultInt(until-1);
    }
  }

  public int sumResultInt(int until){
    if (until == 0){
      return 0;
    } else {
      return until + sumResultInt(until-1);
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
