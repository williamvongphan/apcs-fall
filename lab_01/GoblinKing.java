public class GoblinKing extends Monster {
  public int _health;
  public int _baseDamage;

  public static String about() {
    return "a green giant with a huge club. He has a strong attack and is tougher than the average foe. .";
  }

  public GoblinKing() {
    super();
    _health = 350;
    _baseDamage = 35;
  }

  public String getRole () {
    return "Goblin King";
  }

}
