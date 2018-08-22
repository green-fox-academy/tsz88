package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(){
    numberOfStrings = 4;
  }

  public BassGuitar(int strings){
    numberOfStrings = strings;
  }

  public String sound(){
    return "Duum-duum-duum";
  }
}
