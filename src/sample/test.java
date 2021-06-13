package sample;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x= "hello";
		String y= "world";
		
//		int a = 100;
//		int b = 200;
//		System.out.println(x+y);
//		System.out.println(a+b);
//		System.out.println(x+y+a+b);
		
		System.out.println("lenght " + x.length() + x.toCharArray().length);
		System.out.println(x.lastIndexOf(""));
		
		System.out.println(getLenth("hello"));
		
		

	}
	
	public static int getLenth(String str){
		
		int i=0;
		
		try{
		while(true){
			
			str.charAt(i);
			i++;
		}
		} catch(IndexOutOfBoundsException e){
			
			return i;
			
			
		}
		
		
		
	}

}
