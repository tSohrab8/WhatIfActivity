/*Create a program that allows the user enter a sales record 
(which includes customer number, name, sales amount and a tax code).

tax code   tax amount


NRM           6% 
NPF           0% 
BIZ          4.5% 

The program should output a total that includes the tax owed (if any).

*/

import java.util.*;
public class WhatIfActivity {
	public static void main(String[]args){
		
		double taxOwed = 0, total = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter customer number");
		int custNum = scan.nextInt();
		System.out.println("Please enter customer name");
		String custName = scan.next();
		System.out.println("Please enter sales amount");
		double salesAmount = scan.nextDouble();
		System.out.println("Please enter tax code (NRM, NPF, or BIZ)");
		String taxCode = scan.next();
		
		if (taxCode.equals("NRM")){
			taxOwed = salesAmount * .06;
		}
		else if (taxCode.equals("NPF")){
			
		}
		else if (taxCode.equals("BIZ")){
			taxOwed = salesAmount * .045;
		}
		else{
			System.out.println("That is not a proper tax code");
			return;
		}
		
		total = salesAmount + taxOwed;
		
		System.out.println("Customer ID: " + custNum);
		System.out.println("Customer Name: " + custName);
		System.out.printf("Sales Amount: %.2f \n", salesAmount);
		System.out.println("Tax Code: " + taxCode);
		System.out.printf("Total Amount Due: %.2f \n", total);
		
	}

}
