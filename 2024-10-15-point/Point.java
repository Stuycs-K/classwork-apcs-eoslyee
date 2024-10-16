  public class Point{
    private double x,y;

    public String toString(){
      String ans = "(" + x + ", " + y + ")";
      return ans;
    }

    //Initialize this Point to have the same values as the other Point.
    public Point(Point other){
      x = other.x;
      y = other.y;

      //Then write test cases.
    }

    //Initialize this Point to have the provided values
    public Point(double x, double y){
      this.x=x;
      this.y=y;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }

    /*
    Write this method FOURTH, go to the main and do that one first.
    */
    public double distanceTo(Point other){
      double d = Math.sqrt(Math.pow((other.getX()-this.x), 2) + Math.pow((other.getY()-this.x), 2));
      return d;
    }

    /*
    Write this method last. Re-use (NOT COPY/PASTE) prior work and
    do not write redundant code.
    */
    public static double distance(Point a, Point b){
      double d = a.distanceTo(b);
      return d;
    }


  }
