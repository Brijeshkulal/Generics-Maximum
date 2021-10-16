package com.generics.max;

public class Maximum {
	
	public static Integer findMaximum(Integer a, Integer b, Integer c) {
		Integer max = a;
		if(b.compareTo(max) > 0 && b.compareTo(c) > 0) {
			max = b;
		}
		else if(c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println("Maximum Integer value : " +max);
		return max;
	}
	
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
		Maximum.findMaximum(10,4,12);
		Maximum.findMaximum(7.4f,8.6f,4.9f);
	}

}
