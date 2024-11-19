import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOne {
  public static void main(String[] args){
    
    String filename = "dayOneInput.txt"; 

    System.out.println(distance(filename)); 
  
  }

  public static int distance(String filename){
    //2 Opening a file requires a try/catch
    int x = 0; int y = 0; int orientation = 0;
    try {
      File file = new File(filename); 
      Scanner input = new Scanner(file);
      String data = input.nextLine(); 
      String[] directions = data.split(", "); 

      for (int i = 0; i < directions.length; i ++){
        if (directions[i].charAt(0) == 'R'){
          if (orientation == 3){
            orientation = 0; 
          }
          else {
            orientation ++; 
          }
        }
        else {
          if (orientation == 0){
            orientation = 3;
          }
          else {
            orientation --; 
          }
        }
        int blocks = Integer.parseInt((directions[i].substring(1))); 
        if (orientation == 0){
          y += blocks; 
        }
        if (orientation == 1){
          x += blocks; 
        }
        if (orientation == 2){
          y -= blocks; 
        }
        if (orientation == 3){
          x -= blocks; 
        }
      }
      input.close();//releases the file from your program
    }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }

    return (Math.abs(x) + Math.abs(y));
  }
}
