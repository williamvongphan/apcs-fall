public class Golem extends Monster {
  public int _health;

  public static String about() {
    return "a wall that ran away after it was built. Literally a wall of stone, very tanky.";
  }

  public Golem() {
    super();
    _health = 400;
  }

  public String getRole () {
    return "Golem";
  }

}
