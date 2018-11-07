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

	public static int[] allRowSums(int[][] ary) {
		int[] a = new int[ary.length];
		for (int i = 0; i < ary.length; i++) {
			a[i] = rowSum(ary, i);
		}
		return a;
	}

	public static int[] allColSums(int[][] ary) {
		int index = 0;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i].length > index) index = ary[i].length;
		}
		int[] a = new int[index];
		for (int i = 0; i < index; i++) {
			a[i] = columnSum(ary, i);
		}
		return a;
	}
/*
	public static boolean isRowMagic(int[][] ary) {

	}

	public boolean isColumnMagic(int[][] ary) {

	}
	*/
}