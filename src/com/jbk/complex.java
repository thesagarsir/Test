package com.jbk;

public class complex {

	 private double re, im;          
	 public String toString() {          
		 return "(" + re + " + " + im + "i)";      
		}  
	 complex()
	 {
		 
	 }
	 complex(complex c) {        
		 re = c.re;          
		 im = c.im;     
		}   
}
