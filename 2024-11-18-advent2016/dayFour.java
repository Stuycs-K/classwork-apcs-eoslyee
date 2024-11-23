import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class dayFour {
  public static void main(String[] args){

    String filename = "inputFour.txt";
    System.out.println(p1(filename));
  }

  public static int p1(String filename){
    int[] alphabet = new int[26];
    int sum = 0; 
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String room = input.nextLine();
        System.out.println(room);
        // For every letter in the code (before the []), add 1 to the alphabet. 
        for (int i = 0; i < room.indexOf("["); i ++){
            //System.out.println(room.charAt(i));
            int charIndex = room.charAt(i) - 'a'; 
            //System.out.println(charIndex);
            if (charIndex >= 0 && charIndex < 26){
                alphabet[charIndex] ++; 
            }
        }
        System.out.println(Arrays.toString(alphabet)); 

        // Get the 5 greatest indeces 
        String code = "[";
        for (int counter = 5; counter > 0; counter --){
            
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
