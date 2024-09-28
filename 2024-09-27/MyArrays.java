public class MyArrays{
  public static void main(String[] args){

    int[] ary = {1, 2, 3, 4, 5,};
    
    // Test arrayToString()
    System.out.println("arrayToString(" + ary + "): " + arrayToString(ary));

    // Test returnCopy()
    String aryContent = arrayToString(ary);
    int[] aryCopy = returnCopy(ary);

    System.out.println(arrayToString(aryCopy));
    System.out.println(aryContent.equals(arrayToString(aryCopy)) && (ary != aryCopy));

    // Test concatArray()
    int[] ary1 = {1, 2, 3, 4, 5,};
    int[] ary2 = {6, 7, 8, 9, 10};

    System.out.println(arrayToString(concatArray(ary1, ary2)));
  }

  public static String arrayToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i ++){
      ans += nums[i];
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

  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] ans = new int[ary1.length + ary2.length];
    int i = 0; 
    while (i < ans.length){
      for (int i1 = 0; i1 < ary1.length; i1 ++){
        ans[i] = ary1[i1];
        i ++; 
      }
      for(int i2 = 0; i2 < ary2.length; i2 ++){
        ans[i] = ary2[i2];
        i ++;
      }
    }
    return ans;
  }

}
