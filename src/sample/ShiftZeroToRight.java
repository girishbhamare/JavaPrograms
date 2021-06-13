package sample;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		int[] i = new int[] { 1, 0, 2, 3, 0, 0 };
		System.out.println(Arrays.toString(ShiftZeroToRightArray(i)));

	}

	private static int[] ShiftZeroToRightArray(int[] a) {

		if (a.length == 1) {

			return a;
		}

		int count = 0;

		int newarray[] = new int[a.length];

		for (int number : a) {
			if (number != 0) {
				newarray[count] = number;
				count++;
			}

		}

		return newarray;

		// TODO Auto-generated method stub

	}

}
