import java.util.Random; 

public class Warrior extends Adventurer{
    private int rage, maxRage;

    public Warrior(String name, int hp){
        super(name, hp); 
        this.rage = 0; 
        this.maxRage = 10; 
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
        rage += 2; 
        rage = Math.min(rage, maxRage); // Cap at maxRage
        return getName() + " inflicted " + damage + " damage on " + other.getName() + "!";
    }

    public String support(Adventurer other){
        int heal = (int)Math.random()*3 + 1; 
        other.setHP(Math.min(other.getHP()+heal, other.getmaxHP())); 
        return other.getName() + " healed " + heal + " health!";
    }

    public String support(){
        int heal = (int) Math.random()*3 + 1;
        setHP(Math.min(getHP()+heal, getmaxHP()));
        return getName() + " healed " + heal + " health!";
    }

    public String specialAttack(Adventurer other){
        return ""; 
    }

}