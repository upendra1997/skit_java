/*
Author: Upendra Upadhyay
Aim: make a table.
*/
class Table{
	public static void main(String args[]){
		if(args.length != 2){ System.out.println("Invalid number of arguments."); return;}
		int table = Integer.parseInt(args[0]);
		int limit = Integer.parseInt(args[1]);
		for(int i=1;i<=limit;i++){
			System.out.println(table+" X "+i+" = "+table*i);
		}
	}
}
