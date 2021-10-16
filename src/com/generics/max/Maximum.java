package com.generics.max;

public class Maximum {
	
	public static Float findMaximum(Float a, Float b, Float c) {
		Float max = a;
		if(b.compareTo(max) > 0 && b.compareTo(c) > 0) {
			max = b;
		}
		else if(c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println("Maximum Float value : " +max);
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Generics to calculate Maximum Value");
	}

}
