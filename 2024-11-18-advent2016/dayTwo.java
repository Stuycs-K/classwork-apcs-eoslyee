import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo {
  public static void main(String[] args){

    String filename = "dayTwoInput.java";
  }

  // public static String[] parse(String filename){
  //   String[] data = filename.split(" ");
  // }


  public static int solve{
    //2 Opening a file requires a try/catch
    int x = 1, y = 1;
    int[][] keypad = new int[][]{{"1", "4", "7"}, {"2", "5", "8"}, {"3", "6", "9"}};
    String code = "";
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String line = input.nextLine();
        for (int i = 0; i < line.length(); i ++){
          String dir = line.charAt(i); 
          int[][] increment = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
          if ((x!=0 || x!= 2) && (y!=0 || y!= 2)){

          }
          else {
            code += keypad[x][y]; 
          }
        }
        code += keypad[x][y]; 
      }



      input.close();//releases the file from your program
      }
3

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return code; //you can return from a void function just don't put a value.


  }
}
