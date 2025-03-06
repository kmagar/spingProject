package com.springcore.ci;

public class Addation {
	private int a;
	private int b;
	
public Addation(double a, double b) {
		
		this.a =(int) a;
		this.b =(int) b;
		System.out.println("constructor : double,double");
	}

	public Addation(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("constructor : int,int");
	}
	
	
	
	public void dosum() {
		System.out.println("Value of a:"+this.a);
		System.out.println("Value of b:"+this.b);
		System.out.println("sum is:"+(this.a+this.b));
	}
	
}
