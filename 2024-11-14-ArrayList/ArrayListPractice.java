import java.util.ArrayList;

public class ArrayListPractice{
  public static void main(String[] args){

    int input = (int)(Math.random()*200000);
    System.out.println(createRandomArray(4));
    ArrayList<String> inputal= createRandomArray(20);
    ArrayList<String> inputal2= createRandomArray(11);

    System.out.println("Input: " + inputal);
    replaceEmpty(inputal);
    System.out.println("Result (replaceEmpty): " + inputal);
    System.out.println("Result (makeReversedList): " + makeReversedList(inputal));

    System.out.println("Inputs: " + inputal + )

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

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> ans = new ArrayList<String>(original.size());
    for(int i = original.size()-1; i >= 0; i--){
      ans.add(original.get(i));
    }
    return ans;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> ans = new ArrayList<String>(a.size() + b.size());
  int i = 0;
  while(i < Math.min(a.size(), b.size())){
    ans.add(a.get(i));
    ans.add(b.get(i));
    i ++;
  }
  while (i < a.size()){
    ans.add(a.get(i));
    i ++;
  }
  while (i < b.size()){
    ans.add(b.get(i));
    i ++;
  }
  return ans;
}
}
