import java.util.ArrayList;

public class ArrayListPractice{
  public static void main(String[] args){

    int input = (int)(Math.random()*200000);
    System.out.println(createRandomArray(4));
    ArrayList<String> inputal= createRandomArray(5);
    System.out.println("Input: " + inputal);
    replaceEmpty(inputal);
    System.out.println("Result: " + inputal);
  //  inputal= createRandomArray(input);
  //  System.out.println("Input: " + inputal);
  //  replaceEmpty(inputal);
  //  System.out.println("Result: " + inputal);

  }

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> ans = new ArrayList<String> (size);
    for (int i = 0; i < size; i ++){
      int num = (int)(Math.random() * 11);
      if (num == 0){
        ans.add("");
      }
      else {
        ans.add(""+num);
      }
    }
    return ans;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for(int i = 0; i < original.size(); i++){
    if(original.get(i).equals("")){
      original.set(i, "Empty");
    }
  }
}

}
