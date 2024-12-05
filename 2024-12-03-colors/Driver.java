public class Driver{
    public static void main(String[] args){

        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

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

        System.out.print(Text.RESET);
    }
}