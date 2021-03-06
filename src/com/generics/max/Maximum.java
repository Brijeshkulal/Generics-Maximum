package com.generics.max;

public class Maximum <E extends Comparable<E>> {
	E a, b, c;
	
	public Maximum(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public E findMaximum() {
        return Maximum.findMaximum(a, b, c);
    }
	
	public static <E extends Comparable<E>> E findMaximum(E a, E b, E c) {
		E max = a;
		if(b.compareTo(max) > 0 && b.compareTo(c) > 0) {
			max = b;
		}
		else if(c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Generics to calculate Maximum Value");
	}

}
