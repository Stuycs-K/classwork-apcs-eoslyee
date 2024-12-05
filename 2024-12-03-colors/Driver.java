import java.util.Random;
import java.util.Arrays;

public class Driver{
    public static void main(String[] args){

        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        
        // Make Box 80x30
        int width = 80, height = 30; 
        Text.color((Text.BLUE), Text.background(Text.BLUE), Text.BRIGHT); 
        Text.go(1,1);
        for (int i = 0; i < width; i ++){
            System.out.print(" ");
        }

        for (int i = 2; i < height; i++){
            Text.go(i, 1);
            System.out.print(" ");

            Text.go(i, width);
            System.out.print(" ");
        }

        Text.go(height, 1); 
        for (int i = 0; i < width; i ++){
            System.out.print(" ");
        }  

        // Make Random Array 
        int[] randomArray = new int[3];
        for (int i = 0; i < 3; i ++){
        randomArray[i] = (int)(Math.random() * 100);
        }
        //System.out.println(Arrays.toString(randomArray));

        int space = width/4; 
        Text.go(2, space-2); 
        for (int i = 0; i <3; i ++){
            int s = randomArray[i];
            if (s < 25){
                Text.color(Text.RED, Text.BRIGHT);
            }
            else if (s > 75){
                Text.color(Text.GREEN, Text.BRIGHT);
            }
            else {
                Text.color(Text.WHITE);
            }
            System.out.print(s);
            Text.go(2, ((i+2)*space-2));
        }

        // Horizontal separator
        Text.go(3,2); 
        Text.color(Text.GREEN, Text.BRIGHT);
        for (int i = 0; i < width-2; i++){
            System.out.print("=");
        }

        // Something in the Middle 
        Text.go(height/2, width/2-2);
        Text.color(Text.MAGENTA, Text.BRIGHT); 
        System.out.print("(0)~~[]~~,(0)");

        Text.go(31, 1); 
        System.out.print(Text.RESET);


    }
}