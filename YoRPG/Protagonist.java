public class Protagonist {
    public String name;
    public int health;
    public boolean special;

    public Protagonist (String n) {
        name = n;
        health = 100;
        special = false;
    }

    // Check if the health is greater than 0.
    public boolean isAlive() {
        return health > 0;
    }

    // Convert boolean value to int.
    public int convertBoolean(boolean b) {
        if (b) {
            return 1;
        } else {
            return 0;
        }
    }

    // Take damage from the enemy.
    public void lowerHP(int damage) {
        health -= damage * (1 + convertBoolean(special));
    }

    // Set the health of the Protagonist.
    public void setHealth(int h) {
        health = h;
    }

    // Return a random integer between one number and another.
    public int getRandom(int low, int high) {
        return (int) (Math.random() * (high - low + 1) + low);
    }

    // Attack a monster.
    public int attack(Monster m) {
        int dmg = getRandom(14, 26) * (1 + convertBoolean(special));
        m.takeDamage(dmg);
        return dmg;
    }


    // Set the special status of the Protagonist to true.
    public void specialize () {
        special = true;
    }

    // Set the special status of the Protagonist to false.
    public void normalize () {
        special = false;
    }

    // Return the name of the protagonist
    public String getName() {
        return name;
    }
}