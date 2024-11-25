import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class daySix{
    public static void main (String[] args){
        String filename = "inputSix.txt";
        //System.out.println(countLines(filename)); 
        System.out.println(p1(filename));

        System.out.println(Min(new char[] {'a', 'e', 'e', 'e', 'u', 'a'}));

    }

    public static int countLines(String filename){
        int count = 0; 
        try {
            File file = new File(filename); 
            Scanner input = new Scanner(file); 
            while (input.hasNextLine()){
                input.nextLine(); 
                count ++; 
            }
            input.close(); 
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return count;
    }

    public static char Max(char[] column){
        int[] alphabet = new int[26]; 
        for (int i = 0; i < column.length; i ++){
            int charIndex = column[i] - 'a';
            alphabet[charIndex] ++; 
        }
        //System.out.println(Arrays.toString(alphabet));
        int max = 0; 
        char maxChar = 'a'; 
        for (int i = 0; i < alphabet.length; i ++){
            if (alphabet[i] > max){
                max = alphabet[i]; 
                maxChar = (char)(i + 'a'); 
            }
        }
        return maxChar; 
    }

    public static char Min(char[] column){
        int[] alphabet = new int[26]; 
        for (int i = 0; i < column.length; i ++){
            int charIndex = column[i] - 'a';
            alphabet[charIndex] ++; 
        }
        //System.out.println(Arrays.toString(alphabet));
        int min = 1000; 
        char minChar = Max(column); 
        for (int i = 0; i < alphabet.length; i ++){
            if (alphabet[i] < min && alphabet[i] != 0){
                min = alphabet[i]; 
                minChar = (char)(i + 'a'); 
            }
        }
        return minChar; 
    }


    public static String p1(String filename){
    char[][] data = new char[6][countLines(filename)]; 
    String code = "";
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int column = 0; 
      while (input.hasNextLine()){
        String line = input.nextLine(); 
        for (int i = 0; i < line.length(); i ++){
            data[i][column] = line.charAt(i); 
        }
        column ++; 
      }
    
      for (int i = 0; i < data.length; i ++){
        // code += "" + Max(data[i]); 
        code += "" + Min(data[i]);
      }
      //System.out.println(Arrays.deepToString(data));
      input.close();//releases the file from your program
      }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return code; //you can return from a void function just don't put a value.

  }
}