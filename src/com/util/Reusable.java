package com.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Reusable {
	 static Scanner input = new Scanner(System.in);
	public static String getDetails() {
		String output = "";
		System.out.println("Enter the Mobile Number");
		
		Long number = input.nextLong();
		System.out.println("Enter the password");
		String password = input.next();
		boolean result = Reusable.loginCheck(number, password);
		if (result == true) {
			output = "The userName and Password are valid";
		} else {
			output = "The Credentials are incorrect";
		}
		return output;
	}

	public static boolean loginCheck(Long number, String password) {
		boolean valid = false;
		if (number == 9566087158l) {
			if (password.equals("passwords")) {
				valid = true;
			} else {
				System.out.println("Retry again");
				getDetails();
			}

		}
		return valid;

	}
	public static int cabType() {
		System.out.println("1.Micro - 10Rs/km"+"\n"+"2.Macro - 15Rs/km"+"\n"+"3.Prime - 20Rs/km");
		System.out.println("Enter your cab choice");
		int choice = input.nextInt();
		return choice;
	}
	public static int km() {
		int Distance = input.nextInt();
		return Distance;
		
	}
	public static int  calc(int rate , int Distance ) {
		int multiplication = rate* Distance;
		return multiplication;
	}
	public static double gst(double Price) {
		double gst = (Price * 0.07) + Price;
		return gst;
		}
	public static boolean datecheck(String Date) {
		boolean resultdate = false;
		LocalDate DateObject = LocalDate.parse(Date);
		LocalDate Dateobject = LocalDate.now();
		if(Dateobject.isBefore( DateObject)) {
			resultdate = true;
		}
		return resultdate;
	}
	 public static boolean timecheck(String Time) {
		 boolean Timecheck = false;
		 LocalTime tmObject =LocalTime.parse(Time);
		 int hour =tmObject.getHour();
		 if(hour >=17 && hour <= 19) {
			 Timecheck= false;
		 }
		 return Timecheck; 
	 }
	 public static double peakprice(int Distance , double gst) {
		 double price =  (Distance * 0.025)+gst;
		 return price;
	 }
	 public static boolean seniourcheck(String DOB) {
		 boolean agecheck = false;
		 LocalDate DOBObject = LocalDate.parse(DOB);
		 int Personyear = DOBObject.getYear();
		 LocalDate cdate = LocalDate.now();
		 int cdateyear = cdate.getYear();
		 int ageresult = cdateyear - Personyear;
		 if (ageresult >= 70) {
			 agecheck= true;
		 }
		 return agecheck;
	 }
}