public class Driver {

  public static String printArray(int[]ary) {
		String array = "[";
		for (int i = 0; i < ary.length; i++) {
			array+=ary[i];
			if (i < ary.length - 1) {
				array+=", ";
			}
		}
		array+="]";
		return array;
	}

	public static void main(String[] args) {
		int[][] a = new int[][] {
			{},
			{1, 2, 3},
			{4, 5, 6, 7, 8},
			{9, 10, 11, 12, 13, 14, 15}};

		int[][] b = new int[][] {
			{0, 2, 4, 8, -6},
			{1, 2, -3, 3, 2},
			{0, -2, 6, 9, 55},
			{-3, 0, 3, -62, 1}};
		
		int[][] empty = new int[][] {
			{},
			{}};
		
		int[][] equalRows = new int[][] {
			{0, 2, 4},
			{1, 2, 3},
			{0, 0, 6},
			{3, 0, 3}};

		int[][] equalColumns = new int[][] {
			{0, 2, 4},
			{1, 2, 0},
			{0, 0, 0},
			{3, 0, 0}};
		
		System.out.println("\nTesting rowSum(int[][] ary, int x)");
		System.out.println(ArrayMethods.rowSum(a, 0)+" = 0?");
		System.out.println(ArrayMethods.rowSum(a, 3)+" = 84?");
		System.out.println(ArrayMethods.rowSum(a, 5)+" = 0?");
		System.out.println(ArrayMethods.rowSum(b, 0)+" = 8?");
		System.out.println(ArrayMethods.rowSum(b, 2)+" = 68?");
		System.out.println(ArrayMethods.rowSum(b, -1)+" = 0?");
		System.out.println(ArrayMethods.rowSum(empty, 1)+" = 0?");
		System.out.println(ArrayMethods.rowSum(empty, 2)+" = 0?");
		System.out.println("\n=======\n");

		System.out.println("Testing columnSum(int[][] ary, int x)");
		System.out.println(ArrayMethods.columnSum(a, 0)+" = 14?");
		System.out.println(ArrayMethods.columnSum(a, -1)+" = 0?");
		System.out.println(ArrayMethods.columnSum(a, 7)+" = 0?");
		System.out.println(ArrayMethods.columnSum(empty, 1)+" = 0?");
		System.out.println(ArrayMethods.columnSum(empty, 2)+" = 0?");
		System.out.println("\n=======\n");

		System.out.println("\nTesting allRowSums(int[][] ary)");
		System.out.println(printArray(ArrayMethods.allRowSums(a))+" = [0, 6, 30, 84]?");
		System.out.println("\n=======\n");

		System.out.println("\nTesting allColSums(int[][] ary)");
		System.out.println(printArray(ArrayMethods.allColSums(a))+" = [14, 17, 20, 19, 21, 14, 15]?");
		System.out.println("\n=======\n");

		System.out.println("\nTesting isRowMagic(int[][] ary)");
		System.out.println(ArrayMethods.isRowMagic(a)+" = false?");
		System.out.println(ArrayMethods.isRowMagic(equalRows)+" = true?");
		System.out.println("\n=======\n");

		System.out.println("\nTesting isColumnMagic(int[][] ary)");
		System.out.println(ArrayMethods.isColumnMagic(a)+" = false?");
		System.out.println(ArrayMethods.isColumnMagic(equalColumns)+" = true?");
		System.out.println("\n");

	}
}