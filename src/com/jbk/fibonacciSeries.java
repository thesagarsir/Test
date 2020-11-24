package com.jbk;

public class fibonacciSeries {

	public static void main(String[] args) {
		//0 1 1 2
		int a=0,b=1,c,n=10;
		int i;
		System.out.print(a+" "+b);
		for(i=2;i<n;++i)
		{
			c=a+b;
			System.out.print(" "+c);//3
			a=b; //1
			b=c;// 2
					
			
		}
		
		
	}
}
