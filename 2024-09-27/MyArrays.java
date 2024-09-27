public class MyArrays{
  public static void main(String[] args){

    int[] ary = {1, 2, 3, 4, 5,};
    System.out.println("arrayToString(" + ary + "): " + arrayToString(ary));

  }

  public static String arrayToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i ++){
      ans += nums[i] + i;
      if (i != nums.length-1){
        ans += ", ";
      }
    }
    return ans += "]";
  }
}
