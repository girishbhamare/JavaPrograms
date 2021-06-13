package com.girish.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> productList= Arrays.asList("MAcbook","iphone11","iphoneX");
		
		productList.forEach(ele->System.out.println(ele));
		System.out.println("**** After Excluding****");
		
		List<String> result=productList.stream().filter(ele-> !ele.equals("iphoneX")).collect(Collectors.toList());
		
		result.forEach(System.out :: println);
		
		

	}

}
