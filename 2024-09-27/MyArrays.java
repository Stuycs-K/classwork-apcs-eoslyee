public class MyArrays{
  public static void main(String[] args){

    int[] ary = {1, 2, 3, 4, 5,};

    System.out.println("arrayToString(" + ary + "): " + arrayToString(ary));

    //Test returnCopy()
    String aryContent = arrayToString(ary);
    int[] aryCopy = returnCopy(ary);

    System.out.println(arrayToString(aryCopy));
    System.out.println(aryContent.equals(arrayToString(aryCopy)) && (ary != aryCopy));
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

  public static int[] returnCopy(int[] ary){
    int[] ans = new int[ary.length];
    for (int i = 0; i < ary.length; i ++){
      ans[i] = ary[i];
    }
    return ans;
  }


}
