package battle;

public class MarvelHero extends Hero {

  MarvelHero(String name) {
    super(name);
    motivation = 40;
  }

  MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  public void punch(Punchable other) {
    if (!other.getClass().equals(this.getClass())) {
      super.punch(other);
    } else {
    }


  }
}
