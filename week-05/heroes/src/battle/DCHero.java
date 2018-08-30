package battle;

public class DCHero extends Hero {
  DCHero(String name) {
    super(name);
    motivation = 45;
  }

  DCHero(String name, int motivation) {
    super(name, motivation);
  }

  public void punch(Punchable other) {
    if (!other.getClass().equals(this.getClass())) {
      super.punch(other);
    } else {
    }
  }
}
