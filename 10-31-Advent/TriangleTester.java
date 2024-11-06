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
            
            // Sort into an array
            int[][] vals = new int[3][]; 
            
            int i = 0; 
            while(input.hasNextLine()){
                for (int j = 0; j < 3; j ++){
                    vals[j][i] = input.nextInt(); 
                    vals[j][i+1] = input.nextInt(); 
                    vals[j][i+2] = input.nextInt();   
                }
                i ++; 
            }    

            for (int k = 0; k < i;  k ++){
                int a = vals[0][k];
                int b = vals[1][k];
                int c = vals[2][k]; 
                if (isTriangle(a, b, c)){
                    count ++; 
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
}