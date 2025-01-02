public class Fibonacci{
  public static void main(String[] args){

    String num = args[0];
    Integer.parseInt(num);
    System.out.println(num + ": " + fib(Integer.parseInt(num)));

  }

  public static int fib(int n){
    if (n < 2){
      return n;
    }else {
      return fib(n-1) + fib(n-2);
    }
  }
}
