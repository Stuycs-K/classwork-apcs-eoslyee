import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
 public static void main(String[] args){

    String filename = "inputTri.txt"; 
    
    System.out.println(countTrianglesA(filename));
    
 }

    // Part A 

    public static int countTrianglesA(String filename){
        int count = 0; 
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            
            //CODE THAT SCANS THE FILE.
            while(input.hasNextLine()){
                while(input.hasNextInt()){
                    int a = input.nextInt();
                    int b = input.nextInt();
                    int c = input.nextInt(); 
                    if (isTriangle(a, b, c)){
                        count ++;
                    }
                }
              
            }    
            input.close();//releases the file from your program
        }

        catch (FileNotFoundException ex) {
            //File not found what should you do?
            System.out.println("File not found");
        }
        return count; 
    }

    // Function to check for a valid triangle
    public static boolean isTriangle(int a, int b, int c){
        return (a+b > c) && (b+c > a) && (a+c > b);
    }

}