public class Mage extends Protagonist {

  public Mage(String name) {
    super(name);
  }

  public static String about() {
    return "A wizard who is an expert at magic, especially damage spells. Attacks ignore enemy defense.";
  }

  public int attack(Character m) {
    int totalDamage = 0;
    if (Math.random() > 0.5 ) {
      totalDamage = _baseDamage * _damageMult;
    }
    return m.reduceHealth(totalDamage);
  }

  public String getRole () {
    return "Mage";
  }
}
