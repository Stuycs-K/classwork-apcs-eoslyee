import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Adventurer player = new Warrior("Katniss");
    Adventurer enemy = new CodeWarrior("Konstantinovich");

    String playerHP =  player.getHP() + "/" + player.getmaxHP();
    String playerSpecial = player.getSpecial() + "/" + player.getSpecialMax();
    String enemyHP =  enemy.getHP() + "/" + enemy.getmaxHP();
    String enemySpecial = enemy.getSpecial() + "/" + enemy.getSpecialMax();

    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
    boolean quit = false; 
    while (quit == false && player.getHP()>0 || enemy.getHP()>0){
      System.out.println("Your stats: " + " Health = " + playerHP + ", Special = " + playerSpecial);
      System.out.println("Enemy stats: Health =" + enemyHP +", Special = " + enemySpecial);
      
      System.out.println("What do you want to do? (a)ttack / (sp)ecial / (su)pport / quit");
      String a = userInput.nextLine();
      if (a.equals("attack") || a.equals("a")){
        System.out.println(player.attack(enemy)); 
      }
      if (a.equals("special") || a.equals("sp")){
        System.out.println(player.specialAttack(enemy)); 
      }
      if (a.equals("support") || a.equals("su")){
        System.out.println(player.support());
      }
      if (a.equals("quit")){
        quit = true; 
      }
    }
    

    
  }
}
