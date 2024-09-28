public class MyArrays{
  public static void main(String[] args){

    int[] ary = {1, 2, 3, 4, 5,};

    System.out.println("arrayToString(" + ary + "): " + arrayToString(ary));

    // Test returnCopy()
    String aryContent = arrayToString(ary);
    int[] aryCopy = returnCopy(ary);

    System.out.println(arrayToString(aryCopy));
    System.out.println(aryContent.equals(arrayToString(aryCopy)) && (ary != aryCopy));

    // Test concatArray()
    int[] ary1 = "Hi, this is APCS";
    int[] ary2 = "with Mr. Konstantinovich";

    System.out.println(arrayToSring(concatArray(ary1, ary2)));
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

  public static int[] concatArrady(int[] ary1, int[] ary2){
    int[] ans = new int[ary1.length + ary2.length];
    int i = 0; 
    while (i < ary1.length){
      ans[i] = ary1[i];
      i++;
    }
    while (i < ary2.length){
      ans[i+ary1.length-1] = ary2[i];
      i++;
    }
    return ans;
  }

}
