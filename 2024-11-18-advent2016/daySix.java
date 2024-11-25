import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class daySix{
    public static void main (String[] args){
        String filename = "inputSix.txt";
        System.out.println(p1(filename));
    }

    public static String Max(String[] column){
        return "a"; 
    }

    public static String p1(String filename){
    String[][] data = new String[6][]; 
    String code = "";
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int column = 0; 
      while (input.hasNextLine()){
        String line = input.nextLine(); 
        for (int i = 0; i < line.length(); i ++){
            data[column][i] = line.substring(i, i+1); 
        }
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