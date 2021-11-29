public class Protagonist extends Character {

  public Protagonist() {
    super();
  }

  public Protagonist(String name) {
    super(name);
  }

  public void specialize() {
    this._damageMult = 2;
  }

  public void normalize() {
    this._damageMult = 1;
  }

  public void getHeal() {
    _health += 5; 
  }

  public String getRole () {
    return "Protagonist";
  }
}
