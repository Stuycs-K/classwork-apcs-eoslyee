public class words{

  public static void main(String[] args){
    makeWords(2, "", "abc");
    makeWords(3, "", "xy");

  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters==0){
      System.out.println(result);
      return;
    }
      for (int i = 0; i < alphabet.length(); i ++){
        String newRes = result + alphabet.charAt(i); 
        makeWords(remainingLetters-1, newRes, alphabet);
      }
    
  }
}
