public class ArrayMethods {

	public static int rowSum(int[][] ary, int x) {
		int result = 0;
		if (x >= ary.length) x = 0;
		for (int i = 0; i < ary[x].length; i++) {
			result+= ary[x][i];
		}
		return result;
	}

	public static int columnSum(int[][] ary, int x) {
		int result = 0;
		for (int i = 0; i < ary.length; i++) {
			if (x >= ary[i].length) result+= ary[i][0];
			else result+= ary[i][x];
		}
		return result;
	}
/*
	public static int[] allRowSums(int[][] ary) {

	}

	public static int[] allSolSums(int[][] ary) {

	}

	public static boolean isRowMagic(int[][] ary) {

	}

	public boolean isColumnMagic(int[][] ary) {

	}
	*/
}