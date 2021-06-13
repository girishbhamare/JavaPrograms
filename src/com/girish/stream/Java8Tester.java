package com.girish.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester {

	// Count empty strings

	public static void main(String args[]) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		Long count = strings.stream().filter(str -> str.isEmpty()).count();

		System.out.println(count);

		System.out.println("-------Strings of length 3---");

		count = strings.stream().filter(str1 -> str1.length() == 3).count();

		System.out.println("Strings of length 3 is : " + count);

		// Eliminate empty string

		System.out.println("----Eliminate empty string --");

		List<String> nonEmptyString = strings.stream().filter(str2 -> !str2.isEmpty()).collect(Collectors.toList());

		nonEmptyString.forEach(System.out::println);

		// Eliminate empty string and rejoin using comma

		System.out.println("----Eliminate empty string and rejoin using comma--");

		String nonEmptyStringRejoin = strings.stream().filter(str2 -> !str2.isEmpty())
				.collect(Collectors.joining(", "));

		System.out.println(nonEmptyStringRejoin);
		
		//get list of square of distinct numbers
		
		System.out.println("----Get list of square of distinct numbers--");
		List<Integer> integers = Arrays.asList(2,3,2,4);
		List<Integer> distinctSquareNum=integers.stream().map(num->num*num).distinct().collect(Collectors.toList());
		distinctSquareNum.forEach(System.out::println);
		
		
		 List<Integer> integers1 = Arrays.asList(1,2,13,4,15,6,17,8,19);
		 
		IntSummaryStatistics stats= integers1.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("Max value" +stats.getMax());
		System.out.println("sum value" +stats.getSum());
		

	}

}
