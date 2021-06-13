package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tvSeries= new ArrayList<>();
		
		tvSeries.add("Hello1");
		tvSeries.add("Hello2");
		tvSeries.add("Hello3");
		tvSeries.add("Hello4");
		
		//Itrate using java8 and lambda
		
		tvSeries.forEach(show->{
			
			System.out.println(show);
		});
		
		//simple for loop
		for(String show:tvSeries){
			
			System.out.println(show);
		}
		
		//using iterator
		
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()){
			String show= it.next();
			System.out.println(show);			
			
		}
		
		System.out.println("*******Method Reference***********");
		tvSeries.forEach(System.out::println);
		

	}

}
