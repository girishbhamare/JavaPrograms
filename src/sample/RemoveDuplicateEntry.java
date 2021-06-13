package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateEntry {

	public static void main(String[] args) {

		// A string array with duplicate values
		int[] data = { 1,2,6,3,8,3,5,9,3,6,5 };

		System.out.println("Original array: " + Arrays.toString(data));

		List<Integer> list = new ArrayList<Integer>();
		for(int i:data) {
		list.add(i);
		}
		Set<Integer> set = new HashSet<Integer>(list);

		System.out.print("After removing duplicates: ");
		Integer[] resarray= new Integer[set.size()];
		set.toArray(resarray);

		System.out.println(Arrays.toString(resarray));



		}
}
