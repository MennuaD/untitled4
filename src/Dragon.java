public class Dragon{

    private int health;
    private int strength;
    private int level;
    private boolean isDead;
    private int attackDamage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public Dragon(){
        health = 100;
        level = 1;
        strength = 1;
        isDead = false;
        attackDamage = 0;
        if (attackDamage >= 50){
            level ++;
            System.out.println("This Dragon has reached level " + level + ".");
            attackDamage = 0;
        }
    }

    public int attack(){
        int damage = strength * level;
        attackDamage += damage;
        System.out.println("The dragon attacks for " + damage + " health points.");
        return damage;
    }
    public void take damage












    public String toString(){
 return("Dragon: \nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level + "\nDead = " + isDead + "\nAttack Accumulated = " + attackDamage) ;
    }

}