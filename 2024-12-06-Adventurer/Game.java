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
      String userName = userInput.nextLine();
    }
    

    
  }
}
