package battle;

public class Hero extends BaseHero implements Punchable {

  int motivation;

  Hero(String name, int motivation) {
    super(name);
    this.motivation = motivation;
  }

  public Hero(String name) {
    super(name);
  }

  @Override
  public int getMotivationLevel() {
    if (motivation < 25) {
      return 0;
    } else if (motivation > 25 && motivation < 40) {
      return 1;
    } else {
      return 2;
    }
  }

  @Override
  public void punch(Punchable other) {
    if (motivation > 0){

      double damage = motivation / 1.5;
      other.bePunched(damage);
    }
  }

  @Override
  public void bePunched(double damage) {
    motivation -= damage / motivation;
  }

  public String toString(){
    if (getMotivationLevel() == 0){
      return name + " is not motivated anymore.";
    } else if (getMotivationLevel() == 1){
      return name + " is motivated.";
    } else if (getMotivationLevel() == 2){
      return name + " is well motivated.";
    } else
      return "";
  }
}


