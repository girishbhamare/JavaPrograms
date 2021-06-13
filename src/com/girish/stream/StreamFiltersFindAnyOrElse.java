package com.girish.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFiltersFindAnyOrElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> custList = Arrays.asList(

				new Customer("Tom", 30),
				new Customer("Peter", 34),
				new Customer("Sam", 31),
				new Customer("Girish", 35)

		);
        //Filter with findany 
		System.out.println("-------Filters with Find any----------------");
		Customer custResult = custList.stream().filter(x -> x.getName().equals("Peter")).findAny().orElse(null);

		System.out.println(custResult.getName() + " " + custResult.getAge());
		
		
		System.out.println("-------Filters with many conditions----------------");
		
		
		Customer custResult1 = custList.stream().filter(x -> x.getName().equals("Peter") && x.getAge()==34).findAny().orElse(null);
		System.out.println(custResult1.getName() + " " + custResult1.getAge());

		
		System.out.println("-------Filters Map----------------");
		
		
		String name=custList.stream()
		.filter(x->x.getName().equals("Peter"))
		.map(Customer::getName)
		.findAny()
		.orElse(null);
		
		System.out.println(name);
		
		
		System.out.println("-------Filters Map with all name only----------------");
		List<String> allCustName=custList.stream().map(Customer:: getName).collect(Collectors.toList());
		
		allCustName.forEach(cust-> System.out.println(cust));
		
		System.out.println("-------Filters Map with all Age only----------------");
		List<Integer> allCustAge=custList.stream().map(Customer:: getAge).collect(Collectors.toList());
		
		allCustAge.forEach(cust-> System.out.println(cust));
		
		
		System.out.println("-------Filters Map with all Age more than 31----------------");
		
		List<Integer> allCustAge1=custList.stream().map(Customer:: getAge).filter(age->age>31).collect(Collectors.toList());
		
		allCustAge1.forEach(System.out::println);
		
		
		
	}

}
