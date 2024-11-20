import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo {
  public static void main(String[] args){

    String filename = "inputTwo.txt";
    System.out.println(p1(filename));
  }

  public static String p1(String filename){
    //2 Opening a file requires a try/catch
    int x = 1, y = 1;
    String[][] keypad = new String[][]{{"1", "4", "7"}, {"2", "5", "8"}, {"3", "6", "9"}};
    String code = "";
    try {
      File file = new File(filename); 
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String line = input.nextLine();
        System.out.println(line); 
        for (int i = 0; i < line.length(); i ++){
          String dir = line.substring(i, i+1); 
          if (dir.equals("R") && (x!=2)){
            x ++; 
          }
          if (dir.equals("L") && (x!=0)){
            x --; 
          }
          if (dir.equals("U") && (y!=2)){
            y ++; 
          }
          if (dir.equals("D") && (y!=0)){
            y --; 
          }
          else {
            code += keypad[x][y]; 
          }
        }
        code += keypad[x][y]; 
      }
      input.nextLine(); 
      input.close();//releases the file from your program
      }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return code; //you can return from a void function just don't put a value.


  }
}
