package main.java.music;

public class Violin extends StringedInstrument {
  public Violin(){
    numberOfStrings = 4;
  }

  public Violin(int string){
    numberOfStrings = string;
  }

  public String sound(){
    return "Screech";
  }
}
