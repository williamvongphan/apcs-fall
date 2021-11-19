public class Monster {
    public String name;
    public int health;
    public boolean special;

    public Monster() {

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

    // Return a random integer between one number and another.
    public int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void attack(Protagonist p) {
        p.health -= getRandomInt(14, 26);
    }
}