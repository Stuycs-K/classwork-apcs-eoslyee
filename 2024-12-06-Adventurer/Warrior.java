import java.util.Random;

public class Warrior extends Adventurer{
    private int rage, maxRage;

    public Warrior(String name, int hp){
        super(name, hp);
        this.rage = 0;
        this.maxRage = 10;
    }

    public Warrior(String name){
      this(name, 20);
    }
    public String getSpecialName(){
        return "Rage";
    }

    public int getSpecial(){
        return rage;
    }

    // Assuming n is not greater than maxRage
    public void setSpecial(int n){
        rage = n;
    }

    public int getSpecialMax(){
        return maxRage;
    }

    public String attack(Adventurer other){
        int damage = (int)Math.random()*4 + 2;
        other.applyDamage(damage);
        if (other.getHP()<0){
            other.setHP(0);
        }
        rage += 2;
        rage = Math.min(rage, maxRage); // Cap at maxRage
        return getName() + " inflicted " + damage + " damage on " + other.getName() + "!";
    }

    public String support(Adventurer other){
        if (other.getHP()==0){
            return other.getName() + " is dead.";
        }
        int heal = (int)Math.random()*3 + 1;
        other.setHP(Math.min(other.getHP()+heal, other.getmaxHP()));
        return other.getName() + " healed " + heal + " health!";
    }

    public String support(){
        if (getHP()==0){
            return (getName() + " is dead.");
        }
        int heal = (int) Math.random()*3 + 1;
        setHP(Math.min(getHP()+heal, getmaxHP()));
        return getName() + " healed " + heal + " hearts!";
    }

    public String specialAttack(Adventurer other){
        if (rage < 7){
            return getName() + " is not angry enough to perform special attack!";
        }
        rage -= 7;
        int damage = (int)Math.random()*6+4;
        other.applyDamage(damage);
        if (other.getHP()<0){
            other.setHP(0);
        }
        return getName() + " performed a special attack " + other.getName() + " suffered " + damage + " damage.";
    }

}
