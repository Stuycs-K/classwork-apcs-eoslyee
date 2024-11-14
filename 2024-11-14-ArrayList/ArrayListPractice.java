import java.util.ArrayList;

public class ArrayListPractice{
  public static void main(String[] args){
      System.out.println(createRandomArray(4));
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


}
