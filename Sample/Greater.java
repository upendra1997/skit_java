/*
Author: Upendra Upadhyay
Aim: Find greater of two or three numbers based on the numbers of command line arguments or show proper error.
*/

class Greater{
	public static void main(String args[]){
		int a,b,c;
		switch(args.length){
			case 0: System.out.println("You haven't entered any command line arguments."); break;
			case 1: System.out.println("You have only enered one number: "+args[0]+"."); break;
			case 2: a = Integer.parseInt(args[0]); b = Integer.parseInt(args[1]);
					if(a>b)
						System.out.println("Greater of two numbers is "+a+".");
					else
						System.out.println("Greater of two numbers is "+b+".");
					break;
			case 3: a = Integer.parseInt(args[0]); b = Integer.parseInt(args[1]); c = Integer.parseInt(args[2]);
					if(a>b && a>c)
						System.out.println("Greater of three numbers is "+a+".");
					else if(b>c)
						System.out.println("Greater of three numbers is "+b+".");
					else
						System.out.println("Greater of three numbers is "+c+".");
					break;
			default: System.out.println("Invalid Number of arguments"); break;
		}
	}
}
