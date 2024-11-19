import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo {
  public static void main(String[] args){

    String filename = "dayTwoInput.java";
  }

  // public static String[] parse(String filename){
  //
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
        String +=
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
