package sample;

public class Permutations {
	
	//https://www.youtube.com/watch?v=RnGORu7ihkA
	//Print Permutations of elements of an array with no duplicates

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={1,2,3};
		 printPermutatons(a,0);

	}

	//cid=current index
	public static void printPermutatons(int[] a, int cid) {
		
		if(cid==a.length-1){
			
			printArray(a);
			return;
		}
		
		for (int i=cid; i<a.length;i++){
			
			swap(a, i,cid);
			printPermutatons(a, cid+1);
			swap(a, i,cid);
		}
		
	}

	public static void printArray(int[] a) {
		System.out.println("\n");
		
		for (int i=0;i<a.length;i++){		
			
			System.out.print(a[i] + " ");
			
			
		}
		// TODO Auto-generated method stub
		
	}

	public static void swap(int[] a, int i, int j) {
		
		int temp=a[i];
		a[i]=a[j];
		a[j]= temp;
		
		
		// TODO Auto-generated method stub
		
	}

}
