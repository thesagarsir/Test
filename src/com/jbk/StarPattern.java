package com.jbk;

public class StarPattern {

	public static void main(String[] args) {
		/*
		 
		 star pattern
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
		
		int i,j,k,l;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(k=1;k<=5;k++)
		{
			for(l=4;l>=k;l--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
