import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class dayFour {
  public static void main(String[] args){

    String filename = "inputFour.txt";
    //System.out.println(p1(filename));
  }

  public static int p1(String filename){
    int[] roomAry = new int[26];
    int sum = 0; 
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String room = input.nextLine();
        //System.out.println(line);
        for (int i = 0; i < room.length(); i ++){
            int charIndex = room.charAt(i) - 'a'; 
            if (charIndex > 0 && charIndex < 25){
                roomAry[charIndex] ++; 
            }
        }
        
      }
      input.close();//releases the file from your program
      }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return sum; //you can return from a void function just don't put a value.


  }
}
