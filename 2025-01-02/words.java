public class words{

  public static void main(String[] args){
    System.out.println(makeWords(2, "", "abc"));

  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters==0){
      return result;
    }else{
      for (int i = 0; i < alphabet.size(); i ++);
    }
    int i = 0;
    while (remainingLetters > 0){
      result += alphabet.charAt(i);
      remainingLetters --;
      i ++;
    }
  }
}
