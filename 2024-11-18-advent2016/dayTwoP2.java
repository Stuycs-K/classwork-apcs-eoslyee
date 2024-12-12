import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class dayTwo {
  public static void main(String[] args){

    String filename = "inputTwo.txt";
    System.out.println(p2(filename));
  }

  public static String p2(String filename){
    //2 Opening a file requires a try/catch
    int x = 1, y = 1;
    String[][] keypad = new String[][]{{null, null, "5", null, null}, {null, "2", "6", "A", null}, {"1", "3", "7", "B", "D"}, {null, "4", "8", "C", null}, {null, null, "5", null, null}};
    String code = "";
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String line = input.nextLine();
        System.out.println(line);
        for (int i = 0; i < line.length(); i ++){
          String dir = line.substring(i, i+1);
          int[][] increment = new int[][]{
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
          };
          if (dir.equals("R") && (x!=2)){
            x ++;
          }
          if (dir.equals("L") && (x!=0)){
            x --;
          }
          if (dir.equals("U") && (y!=0)){
            y --;
          }
          if (dir.equals("D") && (y!=2)){
            y ++;
          }
        }
        code += keypad[x][y];
      }
      input.close();//releases the file from your program
      }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return code; //you can return from a void function just don't put a value.


  }
}
