package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar(){
    numberOfStrings = 6;
  }

  public ElectricGuitar(int string){
    numberOfStrings = string;
  }

  public String sound(){
    return "Twang";
  }
}
