package com.jbk;

public class StarPattern4 {

	public static void main(String[] args) {
		
		
		/*
		 
		 Star Pattern 4
		      *
		     **
		    ***
		   ****
		  *****
		   **** 
		    *** 
		     ** 
		      * 
     
	 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
