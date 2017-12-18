/*
Author: Upendra Upadhyay
Aim: Find wheter the entered year is leap year or not.
*/
class Leap_year{
	public static void main(String args[]){
		int year = Integer.parseInt(args[0]);
		if(year>0){
			if(year%400 == 0)
				System.out.println("year entered "+year+" is leap year.");
			else if(year%100 == 0)
				System.out.println("year entered "+year+" is not a leap year.");
			else if(year%4 == 0)
				System.out.println("year entered "+year+" is a leap year.");
			else
				System.out.println("year entered "+year+" is a not leap year.");
		}
		else
			System.out.println("Year entered can't be negative.");
	}
}
