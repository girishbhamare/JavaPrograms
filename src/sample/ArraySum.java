package sample;

public class ArraySum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr={3,2,4,6};
		 int even=0;
		 int odd=0;
		 int counter=0;
			
			int sum=0;
			for (int i=0;i<arr.length;i++){
				
							
				sum = sum+arr[i];
				
				if (sum%2==0){
					
					System.out.println("Sum is even" +sum);
					
					
				}else{
					System.out.println("Sum is odd" +sum);
					counter++;
					
				}
			}
			
			System.out.println("counter is  is \n" +counter);
	}

}
