package sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(5);
		
		
		System.out.println("Printing element" +list);
		
		Collections.reverse(list);
		
		System.out.println("Printing element" +list);
		
		Comparator<Object> cmp = Collections.reverseOrder();
		
		
		Collections.sort(list, cmp);
		

	}

}
