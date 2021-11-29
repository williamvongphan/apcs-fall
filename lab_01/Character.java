public class Character {
  protected String _name;
  protected int _health;
  protected int _baseDamage;
  protected int _damageMult;
  protected int _defense;

  // for creating special attacks that don't depend on damage
  protected boolean _specialized;

  public Character() {
    _health = 100;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 10;
  }

  public Character(String name) {
    _name = name;
    _health = 100;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 10;
  }

  public String getName() {
    return _name;
  }

  public int getHealth() {
    if (_health < 0) {
      _health = 0;
    }
    return _health;
  }

  public boolean isAlive() {
    return _health > 0;
  }

  public int attack(Character m) {
    int totalDamage = 0;
    if (Math.random() > 0.5 ) {
      totalDamage = _baseDamage * _damageMult - _defense;
    }
    return m.reduceHealth(totalDamage);
  }

  public int reduceHealth(int damage) {
    _health -= damage;
    return damage;
  }
}
