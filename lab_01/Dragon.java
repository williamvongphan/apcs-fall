public class Dragon extends Monster {
  public int _defense;

  public static String about() {
    return "a flying mythical creature of mass destruction. Its strong scales give it tough defense. ";
  }

  public Dragon() {
    super();
    _defense = 20;
  }

  public String getRole () {
    return "Dragon";
  }

}
