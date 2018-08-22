package main.java.music;

abstract public class StringedInstrument extends Instrument{
  protected int numberOfStrings;

  public String sound(){
    return "sound";
  }

  public void play(){
    System.out.println(getClass().getName() + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
