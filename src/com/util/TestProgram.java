package com.util;

import java.util.Scanner;

public class TestProgram {
	static Scanner Input = new Scanner(System.in);

	public static void main(String[] args) {

		String valid = Reusable.getDetails();
		System.out.println(valid);
		int cabchoise = Reusable.cabType();
		cabDetails(cabchoise);

	}

	public static void cabDetails(int cabchoise) {
		switch (cabchoise) {
		case 1:
			int rate = 10;
			System.out.println("The Cab selected is Micro");
			System.out.println("Enter the Kilometer To travel: ");
			int Distance = Reusable.km();
			int Price = Reusable.calc(rate, Distance);
			double gst = Reusable.gst(Price);
			System.out.println(
					"The Price for the Micro Cab Without gst is: " + Price + " and the price with gst is " + gst);
			juorneydetails(gst, Distance);
			break;
		case 2:
			int rate1 = 15;
			System.out.println("The Cab selected is Mini");
			System.out.println("Enter the Kilometer To travel: ");
			int Distance1 = Reusable.km();
			int Price1 = Reusable.calc(rate1, Distance1);
			double gst1 = Reusable.gst(Price1);
			System.out.println(
					"The Price for the Mini Cab Without gst is: " + Price1 + " and the price with gst is " + gst1);
			juorneydetails(gst1, Distance1);
			break;
		case 3:
			int rate2 = 20;
			System.out.println("The Cab selected is Prime");
			System.out.println("Enter the Kilometer To travel: ");
			int Distance2 = Reusable.km();
			int Price2 = Reusable.calc(rate2, Distance2);
			double gst2 = Reusable.gst(Price2);
			System.out.println(
					"The Price for the Prime Cab Without gst is: " + Price2 + " and the price with gst is " + gst2);
			juorneydetails(gst2, Distance2);
			break;
		default:
			System.out.println("Invalid Choise");
		}

	}

	public static void juorneydetails(double gst, int Distance) {
		System.out.println("Enter the Date of Jurorney in YYY-MM-DD :  ");
		String Date = Input.next();
		boolean datecheck = Reusable.datecheck(Date);
		if (datecheck == false) {
			System.out.println("The Date Is Old Date ");
		}
		System.out.println("Enter the Time in HH:MM:SS: ");
		String Time = Input.next();
		System.out.println("The Cab is Booked for " + Date + "at " + Time);
		boolean timecheck = Reusable.timecheck(Time);
		if (timecheck == false) {
			System.out.println("The Entered Time is Peak Hours");
			double peakprice = Reusable.peakprice(Distance, gst);
			System.out.println("The Revised Fare With Peak Hour Charges is :" + peakprice);
			System.out.println("Enter the Date Birth For Seniour Citizen Check :");
			String DOB = Input.next();
			boolean seniourcheck = Reusable.seniourcheck(DOB);
			if (seniourcheck == true) {
				System.out.println("The age entered is Eligible For Seniour Citizien");
				double DiscountedPrice = (peakprice * 50) / 100;
				System.out.println("The Discounted Price for the Seniour Citizen Discount is :" + DiscountedPrice);
			} else {
				System.out.println("The Age is Not Eligble For Seniour Citizien Discount the price is :" + gst);
			}
		} else {
			System.out.println("This Is not Peak Hour the Fare is: " + gst);
			System.out.println("Enter the Date Birth For Seniour Citizen Check :");
			String DOB = Input.next();
			boolean seniourcheck = Reusable.seniourcheck(DOB);
			if (seniourcheck == false) {
			} else {
				System.out.println("The Age is Not Eligble For Seniour Citizien Discount the price is :" + gst);
			}

		}
	}
}
