package practice;

import java.util.Scanner;

public class buisness {
	public static void main(String[]args) {
		System.out.println("enter your annual_income");
		System.out.println("enter loan type");
		System.out.println("enter nationality");
		System.out.println("enter age");
		
		
		Scanner sc=new Scanner(System.in);
		int aincome=sc.nextInt();
	    String type=sc.next();
	    int nationality=sc.nextInt();
	    int age=sc.nextInt();
	    double loan_amt=0.0;
	    double emi=0.0;
	    int tenure=0;
	    
	    
	    if(type.equals("buisness")) {
	    	if((age<20 && age>=60) || aincome<300000) {
	    		System.out.println("you are not eligible");
	    	}
	    	else {
	    		if(aincome>300000 && aincome<=500000) {
	    			double intrate=5.0;
	    			loan_amt=1500000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else if(aincome>500000 && aincome<=1500000) {
	    			double intrate=6.0;
	    			loan_amt=1500000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    			
	    		}
	    		else if(aincome>1500000 && aincome<=3000000) {
	    			double intrate=7.0;
	    			loan_amt=1500000;
	    			tenure=(60-age)*12;
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure)-1);
	    		}
	    		else {
	    			double intrate=10.0;
	    			loan_amt=1500000;
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


