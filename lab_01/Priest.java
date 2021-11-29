public class Priest extends Protagonist {

  public Priest(String name) {
    super(name);
    _defense = 10;
  }

  public static String about() {
    return "A messenger of God with powerful prayers. Heals self for 10 health after every round, but has decreased defense. Specialized attacks deal double damage.";
  }

  public String getRole () {
    return "Priest";
  }
}
