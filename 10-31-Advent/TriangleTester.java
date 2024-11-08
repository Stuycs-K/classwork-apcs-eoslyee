import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
 public static void main(String[] args){

    String filename = "inputTri.txt"; 
    
    System.out.println(countTrianglesA(filename));
    System.out.println(countTrianglesB(filename)); 
    
 }

    // Function to check for a valid triangle
    public static boolean isTriangle(int a, int b, int c){
        return (a+b > c) && (b+c > a) && (a+c > b);
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

    // Part B
    public static int countTrianglesB(String filename){
        int count = 0; 
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
                        
            int i = 0; 
            while(input.hasNextLine()){
                int a1 = input.nextInt(); 
                int a2 = input.nextInt(); 
                int a3 = input.nextInt();   
                int b1 = input.nextInt(); 
                int b2 = input.nextInt(); 
                int b3 = input.nextInt();   
                int c1 = input.nextInt(); 
                int c2 = input.nextInt(); 
                int c3 = input.nextInt();   

                if(isTriangle(a1, b1, c1)){
                    count ++;
                }

                if(isTriangle(a2, b2, c2)){
                    count ++;
                }

                if(isTriangle(a3, b3, c3)){
                    count ++;
                }
            }
                i++;

            input.close();//releases the file from your program
        }

        catch (FileNotFoundException ex) {
            //File not found what should you do?
            System.out.println("File not found");
        }
        return count; 
    }
}