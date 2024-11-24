import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class dayFour {
  public static void main(String[] args){

    String filename = "inputFour.txt";
    System.out.println(p1(filename));

    int[] testMaxAry = new int[]{1, 2, 3, 2, 3, 5}; 
    System.out.println(returnMax(testMaxAry)); 
    System.out.println(returnMax(testMaxAry)); 

    String testRoom = "aaaaa-bbb-z-y-x-123[abxyz]"; 
    System.out.println(checkRoom(testRoom)); // Should return true 
  }
  
  // Return the character with the most occurances in the line 
  public static char returnMax(int[] alphabet){
    int max = 0; 
    char maxChar = 'a'; 
    for (int i = 0; i < alphabet.length; i ++){
        if (alphabet[i] > max){
            max = alphabet[i]; 
            maxChar = (char)(i + 'a'); 
        }
    }
    alphabet[maxChar-'a'] = 0; 
    return maxChar; 
  }

  // Return true if the checkSum properly represents the line
  public static boolean checkRoom(String room){
    String checkSum = room.substring(room.indexOf("["), room.length()-1); 
    int [] alphabet = new int[26];
    String realRoom = ""; 
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
    for (int i = 0; i < 5; i ++){
        realRoom += returnMax(alphabet); 
    }
    System.out.println(realRoom);
    return (realRoom.equals(checkSum)); 
  }


  public static int p1(String filename){
    int[] alphabet = new int[26];
    int sum = 0; 
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String room = input.nextLine();
        String checkSum = room.substring(room.indexOf("["), room.length()-1); 
        System.out.println(room);
        if (checkRoom(room)){
            sum += Integer.parseInt(checkSum); 
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
