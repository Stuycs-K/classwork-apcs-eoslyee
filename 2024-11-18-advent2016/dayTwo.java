import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo {
  public static void main(String[] args){

    //2 Opening a file requires a try/catch
    try {
      File file = new File("dayOneInput.java");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      }

      input.close();//releases the file from your program
    }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }


  }

  public static int countBlocks (File filename){
    int x; int y; int i = 0;
    
  }
}