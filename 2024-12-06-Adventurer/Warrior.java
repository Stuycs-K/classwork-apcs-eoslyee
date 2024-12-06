import java.util.Random; 

public class Warrior extends Adventurer{
    private int rage, maxRage;

    public Warrior(String name, int hp){
        super(name, hp); 
    }
    public String getSpecialName(){
        return ""; 
    }

    public int getSpecial(){
        return 0; 
    }

    public void setSpecial(int n){

    }

    public int getSpecialMax(){
        return 0; 
    }

    public String attack(Adventurer other){
        return "";
    }

    public String support(Adventurer other){
        return "";
    }

    public String support(){
        return "";
    }

    public String specialAttack(Adventurer other){
        return ""; 
    }

}