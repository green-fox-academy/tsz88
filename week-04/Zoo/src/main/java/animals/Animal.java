package main.java.animals;

abstract public class Animal {
  protected String name;
  protected int age;
  //not specified but requested in task
  protected boolean ifDangerous;
  protected String habitat;
  protected String diet; //carnivore, omnivore, herbivore...


  public String getName(){
    return name;
  }

  public String reproduce(){
    return "";
  }

  public void allStats(){
    if (!name.isEmpty()){
      System.out.println("Name: " + name);
    }
    if (age != 0) {
      System.out.println("Age: " + age);
    }
    System.out.println("Is it dangerous? " + ifDangerous);
    if (!habitat.isEmpty()) {
      System.out.println("Preferred habitat: " + habitat);
    }
    if (!diet.isEmpty()) {
      System.out.println("Diet: " + diet);
    }
    System.out.println("Way of reproduction: " + reproduce());
    System.out.println("---------------------");
  }
}
