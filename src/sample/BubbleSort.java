package sample;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, 9, 7, 6, 10 };

		System.out.println("original sequense is \n  ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println("array list is " + arr[i] + ", ");
		}

		sort(arr);
	}

	public static void sort(int[] ar) {
		int temp;

		for (int i = ar.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (ar[j] > ar[j + 1]) {

					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}

		}

		System.out.println("final sequense is:- \n   ");
		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i] + ",  ");
		}
	}

}
