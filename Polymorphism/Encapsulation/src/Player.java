public class Player {
    public String name;
    public String weapon;
    public int health;

    public void loseHealth(int damage){

        health = health - damage;
        if(health <= 0) {
            System.out.println("Plyer knocked out of game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if(health > 100){
            System.out.println("Player resotred to 100%");
            health = 100;
        }
    }
}
