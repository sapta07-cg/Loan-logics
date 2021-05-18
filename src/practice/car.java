package practice;

import java.util.Scanner;

public class car {
	public static void main(String[]args) {
		System.out.println("enter your annual_income");
		System.out.println("enter loan type");
		
	    Scanner sc=new Scanner(System.in);
	    int aincome=sc.nextInt();
	    String type=sc.next();
	    if(type.equals("car")){
	    	int tenure=5;
	    	double int_rate=7.5;
	    	if(aincome>300000) {
	    		double loanamt=(aincome/24)*(tenure*12);
	    		if(loanamt>1000000) {
	    			loanamt=800000;
	    		}
	    		double emi=(loanamt+((loanamt*7.5)/100))/(tenure*12);
	    		System.out.println(loanamt);
	    		System.out.println(emi);
	    		
	    	}
	    	else {
	    		System.out.println("you are not eligible");
	    	}
	    }
	    else {
	    	System.out.println("WRONG input");
	    	
	    }
	    
	}

}
