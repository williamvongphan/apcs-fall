public class Monster {
    public int health;
    public int lowDmg;
    public int highDmg;

    public Monster() {
        health = 100;
        lowDmg = 14;
        highDmg = 26;
    }

    public Monster(int low, int high) {
        health = 100;
        lowDmg = low;
        highDmg = high;
    }

    public boolean isAlive() {
        return health > 0;
    }

    // Set the health of the Monster.
    public void setHealth(int h) {
        health = h;
    }

    // Take a hit from the Protagonist.
    public void takeDamage(int damage) {
        health -= damage;
    }

    // Return the health of the monster.
    public int getHealth() {
        return health;
    }

    // Return a random integer between one number and another.
    public int getRandom(int low, int high) {
        return (int) (Math.random() * (high - low + 1) + low);
    }

    public int attack(Protagonist p) {
        int dmg = getRandom(lowDmg, highDmg);
        p.takeDamage(dmg);
        return dmg;
    }
}