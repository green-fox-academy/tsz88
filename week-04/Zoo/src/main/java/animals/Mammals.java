package main.java.animals;

public class Mammals extends Animal{
  protected String bodyTempType = "endotherm";
  protected boolean hasASpine = true;

  public String reproduce(){
    return "pushing miniature versions out";
  }

  public void motto(){
    System.out.println("We have brains!");
  }

}
