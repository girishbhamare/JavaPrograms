package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionofWeekDays
{
   public static void main(String[] args)
   {
      ArrayList<String> weekDays = new ArrayList<String>();
     
      weekDays.add("Monday");
      weekDays.add("Tuesday");
      weekDays.add("Wednesday");
      weekDays.add("Thursday");
      weekDays.add("Friday");
      weekDays.add("Saturday");
      weekDays.add("Sunday");


      // Find the position of current day in the ArrayList

      int x = weekDays.indexOf("Monday");
      System.out.println("Index Of \"Monday\": " + weekDays.indexOf("Monday"));
      
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the user input index as n - ");  
      int n= sc.nextInt();

//      if(n<0)
//      {
//          n=n+7;
//      }
//      else if (n>7)
//      {
//       n=n-7;
//      }
      
      System.out.println("xxx" +x);
      int dayval=x+n;
     
     // System.out.println("WeekDay is ==="+weekDays(+dayval));
      
      System.out.println("WeekDay is ===" +dayval);
   }
}
