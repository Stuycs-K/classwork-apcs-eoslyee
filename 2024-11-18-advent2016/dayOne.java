import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class dayOne {
  public static void main(String[] args){
    
    String filename = "inputOne.txt"; 

    System.out.println(distance(filename)); 
  
  }

  public static int distance(String filename){
    //2 Opening a file requires a try/catch
    int x = 0; int y = 0; int orientation = 0;
    ArrayList<String> visitedCoors = new ArrayList<String>(); 
    try {
      File file = new File(filename); 
      Scanner input = new Scanner(file);
      String data = input.nextLine(); 
      String[] directions = data.split(", "); 

      for (int i = 0; i < directions.length; i ++){
        // Adjust orientation based on turn
        if (directions[i].charAt(0) == 'R') {
          orientation = (orientation + 1) % 4; // Right turn
        } else {
          orientation = (orientation + 3) % 4; // Left turn
        }
        int blocks = Integer.parseInt((directions[i].substring(1)));
        int[][] increment = new int[][]{
          {0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int j = 0; j < blocks; j ++){
          x += increment[orientation][0]; 
          y += increment[orientation][1];

          String currentCoor = "(" + x + ", " + y + ")";
          for (int k = 0; k < visitedCoors.size(); k ++){
            if (currentCoor.equals(visitedCoors.get(k))){
              input.close();
              return Math.abs(x) + Math.abs(y);
            }
          }
          visitedCoors.add(currentCoor); 
        } 
        //System.out.println(visitedCoors);
      }
      input.close();//releases the file from your program
    }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }

    return -1;
  }
}
