package sample;

public class secondhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 9, 2, 5, 6 };
//
//		System.out.println("arry " + arr[0]);
//
//		int highestnumber = 0;
//		int secondhighestnumber = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] > highestnumber) {
//
//				secondhighestnumber = highestnumber;
//				highestnumber = arr[i];
//
//			} else if (arr[i] > secondhighestnumber) {
//				secondhighestnumber = arr[i];
//
//			}
//
//		}
//
//		System.out.println(" sendhight number " + secondhighestnumber);
//		System.out.println(" highst  number " + highestnumber);

		
		int [] arr={9,2,5,6};
		
		int highest_nuber=0;
		int second_highestnumber=0;
		
		for (int i=0; i < arr.length; i++){
			
			if (arr[i]>highest_nuber){
				second_highestnumber=highest_nuber;
				highest_nuber=arr[i];
			}else if(arr[i]>second_highestnumber){
				 second_highestnumber=arr[i];
				
			}
		}
		System.out.println(" sendhight number " + highest_nuber);
		System.out.println(" highst  number " + second_highestnumber);
		
	}

}
