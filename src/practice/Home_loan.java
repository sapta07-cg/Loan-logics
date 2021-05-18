package practice;

import java.util.Scanner;

public class Home_loan {
	public static void main(String[]args) {
		System.out.println("enter your annual_income");
		System.out.println("enter loan type");
		System.out.println("enter age");
		
		Scanner sc=new Scanner(System.in);
		int aincome=sc.nextInt();
	    String type=sc.next();
	    int age=sc.nextInt();
	    double loan_amt=0.0;
	    double emi=0.0;
	    int tenure=0;
	    
	    if(type.equals("home")) {
	    	if((age<20 && age>=60) || aincome<300000) {
	    		System.out.println("you are not eligible");
	    	}
	    	else if(age>=20 && age<=30) {
	    		double intrate=6.0;
	    		if(aincome>300000 && aincome<=500000) {
	    			loan_amt=1500000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    			
	    			
	    		}
	    		else if(aincome>500000 && aincome<=1000000) {
	    			loan_amt=3000000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else if(aincome>1000000) {
	    			loan_amt=5000000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    			    		
	    	}
	    		
	    	else if(age>30 && age<=50) {
	    		double intrate=8.0;
	    		if(aincome>300000 && aincome<=500000) {
	    			loan_amt=1200000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else if(aincome>500000 && aincome<=1000000) {
	    			loan_amt=2500000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else if(aincome>1000000) {
	    			loan_amt=4500000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    	}
	    	
	    	else if(age>50 &&age<60) {
	    		double intrate=10.0;
	    		if(aincome>300000 && aincome<=500000) {
	    			loan_amt=1000000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else if(aincome>500000 && aincome<=1000000) {
	    			loan_amt=2000000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else if(aincome>1000000) {
	    			loan_amt=4000000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    	}
	    		
	    	}
	    else {
	    	System.out.println("wrong input");
	    }
	    	System.out.println(loan_amt);
	    	System.out.println(emi);
	    }
		
		
	}

