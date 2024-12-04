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

    System.out.print("\u001b[1;4;34;102m");
    System.out.print("Surprise");
    System.out.println("\u001b[0m");
      try{
              Thread.sleep(500);
      }catch(Exception e){
      }
    int g = 15;
    int r = 100;
    for (int index = 4; index > 0; index--){
        for (int i = 100; i > 0; i--){
        for(int b = 0; b < 252; b+=38){
            System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m");
            System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m ");
        }
        }
        for (int i = 100; i > 0; i--){
        for(int b = 252; b > 0; b-=38){
            System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m");
            System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m ");
        }
        }
    }

    System.out.print("\u001b[0m");
  }

  public static int BLACK = 30;
  public static int RED = 31;

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

}

