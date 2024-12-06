public class Driver{
    public static void main(String[] args){
        Adventurer p1 = new Warrior("Bob", 10); 
        Adventurer p2 = new Warrior("Toby", 10); 

        // Test attack 
        System.out.println(p1.attack(p2)); 
        System.out.println(p2 + "'s health = " + p2.getHP());

        for (int i = 0; i <= 7; i ++){
            p1.attack(p2); 
        }
        System.out.println(p1.specialAttack(p2)); 
        System.out.println(p2 + "'s health = " + p2.getHP()); 
        System.out.println(p1.specialAttack(p2)); // Should not special attack

        // Test support 
        System.out.println(p1.support(p2)); 
        System.out.println(p2 + "'s health = " + p2.getHP());

        p1.setHP(3); 
        System.out.println(p1.support()); 
        System.out.println(p1 + "'s health = " + p1.getHP());

    }
}