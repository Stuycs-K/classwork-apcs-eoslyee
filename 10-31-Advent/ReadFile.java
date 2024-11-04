  //1 you need all three imports.
  import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;

  public class ReadFile {

    public static void main(String[] args) {
      //2 Opening a file requires a try/catch
      try {
        File file = new File("ReadFile.java");//1
        Scanner input = new Scanner(file);
        //CODE THAT SCANS THE FILE.
        // Stop and test opening ReadFile.java and printing every other line of text.
        while(input.hasNextLine()){
          input.nextLine();
          if (input.hasNextLine()){
            System.out.println(input.nextLine());
          }
        }






        // Now try changing the program to only print a line of text if it contains a '{' character.
        while(input.hasNextLine()){
          String Input = input.nextLine();
          if (Input.indexOf("{") != -1){
            System.out.println(Input);
          }
        }



        input.close();//releases the file from your program
      }

      catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return; //you can return from a void function just don't put a value.
      }

      System.out.println("check odd lines");

    }
  }
