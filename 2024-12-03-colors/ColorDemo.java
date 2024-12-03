public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void main(String[] args){
    for(int r = 0; r < 256; r+=38){
      for(int g = 0; g <= 256; g+=38){
        for(int b = 0; b <= 256; b+=38){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m ");
        }
      }
        System.out.println();
    }

  }
}
