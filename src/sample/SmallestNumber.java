package sample;

// Java program to find the smallest
//number whose sum of digits is also N
public class SmallestNumber{

//Function to get sum of digits
static int getSum(int n)
{
 int sum = 0;
 while (n != 0)
 {
     sum = sum + n % 10;
     n = n / 10;
 }
 return sum;
}

//Function to find the smallest
//number whose sum of digits is also N
static void smallestNumber(int N)
{
 int i = 1;
 while (1 != 0)
 {
     // Checking if number has
     // sum of digits = N
//     if (getSum(i) == N)
//     {
//         System.out.print(i);
//         break;
//     }
//     i++;
	 if (getSum(i) == 2*(getSum(N))&& i>N){
		 
		 System.out.print(i);
		 break;
	 }
	 i++;
	 
 }
}

//Driver code
public static void main(String[] args)
{
 int N = 14;
 smallestNumber(N);
}
}

