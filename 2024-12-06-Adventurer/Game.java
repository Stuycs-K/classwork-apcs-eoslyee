import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Adventurer player = new Warrior("Katniss");
    Adventurer enemy = new CodeWarrior("Konstantinovich");

    String playerHP =  player.getHP() + "/" + player.getmaxHP();
    String playerSpecial = player.getSpecial() + "/" + player.getSpecialMax();
    System.out.println("Your stats: " + " Health = " + playerHP + ", Special = " + playerSpecial);
    String enemyHP =  enemy.getHP() + "/" + enemy.getmaxHP();
    String enemySpecial = enemy.getSpecial() + "/" + enemy.getSpecialMax();
    System.out.println("Enemy stats: Health =" + enemyHP +", Special = " + enemySpecial);

    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user inputCreate a class Game.java in the same classwork directory.
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);
  }
}
