public class Assassin extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Assassin(String name) {
    super(name);
    _baseDamage = 20; 
  }

  public static String about() {
    return "A marksman with a bow who never misses an attack. Specialized attacks have a 10% chance of dealing 5x damage.";
  }

  public int attack(Character m) {
    int totalDamage = 0;
    totalDamage = _baseDamage * _damageMult - _defense;
    return m.reduceHealth(totalDamage);
  }


  public void specialize() {
    if ((int) (Math.random() * 10) < 1 ) { // 10% chance
      this._damageMult = 5; // 10x damage
    } else {
      this._damageMult = 1; // 90% chance no damage
    }
  }

  public String getRole () {
    return "Assassin";
  }

}
