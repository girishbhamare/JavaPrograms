package sample;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDaysOfWeek {

public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<String> weekdays=new ArrayList<String>();
      weekdays.add("Monday");
      weekdays.add("Tuesday");
      weekdays.add("Wednesday");
      weekdays.add("Thursday");
      weekdays.add("Friday");
      weekdays.add("Saturday");
      weekdays.add("Sunday");
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Week day to be selected");
      String weekdaysel=sc.nextLine();
   
      int find=0;
      System.out.println("Enter operation(+ or -) to be performed on "+weekdaysel);
      String op=sc.nextLine();
     
      System.out.println("Enter number to be added or subtracted");
      int no=sc.nextInt();
     
      System.out.println("The question is "+weekdaysel+" "+op+" "+""+no);

      int ind=weekdays.indexOf(weekdaysel);
     
      if(op.equals("+")){
       find=ind+no;
      }else{
       find=ind-no;
      }
     
      if(find>6){
      find=7-find;
     
      }
      if(find<0){
      find=7+find;
      }
 
      String result=weekdays.get(find);
      System.out.println("Result is "+weekdaysel+" "+op+" "+""+no+" = "+result);

}

}