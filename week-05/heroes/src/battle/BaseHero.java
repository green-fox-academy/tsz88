package battle;

public abstract class BaseHero {

  protected String name;

  BaseHero(String name) {
    this.name = name;
  }

  public abstract void punch(Punchable other);

  public abstract int getMotivationLevel();

  public String getName() {
    return name;
  }

}
