public class ArrayMethods{
  public static void main(String[] args){
    // Alishair; aturakulov50@stuy.edu
    // Estella; eyee60@stuy.edu.

    // Test arrToString with 2D parameter
    System.out.println("-----Test arrToString with 2D parameter-----");
    System.out.println("Expected [[1,2], [5,6], [0,3,5]], Returned " + arrToString(new int[][] {{1, 2}, {5, 6}, {0, 3, 5}}));
    System.out.println("Expected [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]], Returned " + arrToString(new int[3][4]));

    // Test arr2DSum 
    System.out.println("-----Test arr2DSum-----");
    System.out.println("Expected "+(1+2+5+6+0+3+5) + ", Returned " + arr2DSum(new int[][] {{1, 2}, {5, 6}, {0, 3, 5}}));
    System.out.println("Expected 0, Returned " + arr2DSum(new int[3][4]));

    // Test swapRC
    System.out.println("-----Test swapRC-----"); 
    System.out.println("Expected [[1,4],[2,5],[3,6], Returned:" + arrToString(swapRC(new int[][]{{1,2,3},{4,5,6}})));
    System.out.println("Expected [[2,1,8,10],[3,5,9.8]], Returned: " + arrToString(swapRC(new int[][] {{2,3},{1,5},{8,9},{10,8}})));

    //Test replaceNegative
    System.out.println("-----Tests for replaceNegative-----");
    System.out.println("Expected Output: [[1, 3, 5], [0, 1, 8], [0]]"); replaceNegative(new int[][]{{-1, 3, 5}, {-5, -2, 8}, {0}});
    System.out.println("Expected Output: [[1, 3, 5], [5, 2, 8], [0]]"); replaceNegative(new int[][]{{1, 3, 5}, {5, 2, 8}, {0}});
    System.out.println("Expected Output: [[1, 0, 0], [0, 2, 0], [0]]"); replaceNegative(new int[][]{{1, -3, -5}, {-5, 2, -8}, {-9}});

    //Test copy 
    System.out.println("---Testing returnCopy for 1D Array---");
    int[] ary = {1, 2, 3, 4, 5};
    String aryContent = arrToString(ary);
    int[] aryCopy = returnCopy(ary);

    System.out.println(arrToString(aryCopy));
    System.out.println("Contents are equal but addresses are not: " + (aryContent.equals(arrToString(aryCopy)) && (ary != aryCopy)));

    System.out.println("-----Tests for copy-----");
    int[][] Ary = new int[][]{{1, 2, 3}, {2, 3}, {0}};
    int[][] AryCopy = copy(Ary);
    System.out.println("Original Array: " + arrToString(Ary));
    System.out.println("Array Copy: " + arrToString(AryCopy));
    System.out.println("Contents are equal but addresses are not: " + (arrToString(Ary).equals(arrToString(AryCopy)) && (Ary != AryCopy)));
    
    Ary = new int[][]{{2,3,4},{1,2},{10}};
    System.out.println(arrToString(Ary));
    System.out.println("Array Copy: " + arrToString(AryCopy));


}

    //2. Copy your arrToString method from before.
    /**Return a String that represets the array in the format:
    * "[2, 3, 4, 9]"
    * Note the comma+space between values, and between values
    */

  public static String arrToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i ++){
      ans += nums[i];
      if (i != nums.length-1){
        ans += ", ";
      }
    }
    return ans += "]";
  }


  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
    public static String arrToString(int[][]ary){
      String ans = "[";
      for (int i = 0; i < ary.length; i++) {
        ans += arrToString(ary[i]);
        if (i != ary.length-1) {
          ans += ", ";
        }
      }
      return ans += "]";
    }

// /*Return the sum of all of the values in the 2D array */
// Use a nested loop 
  public static int arr2DSum(int[][]nums){
    int sum = 0; 
    for (int i = 0; i < nums.length; i ++){
      for (int index = 0; index < nums[i].length; index ++){
        sum += nums[i][index];
      }
    }
    return sum; 
  }

// /**Rotate an array by returning a new array with the rows and columns swapped.
//   * You may assume the array is rectangular and neither rows nor cols is 0.
//   * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}

  public static int[][] swapRC(int[][]nums){
    int[][] ans = new int[nums[0].length][nums.length];
    for (int i = 0; i < ans.length; i ++){
      for (int index = 0; index < ans[i].length; index ++){
        ans[i][index] = nums[index][i];  
      }
    }
    return ans;
  }

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
	System.out.println("Input: " + arrToString(vals));
	for (int i = 0; i < vals.length; i++) {
		for (int j = 0; j < vals[i].length; j++) {
			if (vals[i][j] < 0) {
				if (i == j) {
					vals[i][j] = 1;
				} else {
					vals[i][j] = 0;
				}
			}
		}
	}
	System.out.println("Output: " + arrToString(vals));
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums){
  int[][] ans = new int[nums.length][];
  for (int i = 0; i < nums.length; i ++){
    ans[i] = returnCopy(nums[i]);
  }
  return ans;//placeholder so it compiles
}

 public static int[] returnCopy(int[] ary){
    int[] ans = new int[ary.length];
    for (int i = 0; i < ary.length; i ++){
      ans[i] = ary[i];
    }
    return ans;
  }

}

