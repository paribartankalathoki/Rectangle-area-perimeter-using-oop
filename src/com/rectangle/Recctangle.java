package com.rectangle;

/**
 * @author Paribartan
 *
 */
public class Recctangle {

	public static void main(String[] args) {
		Rect rect = new Rect(10, 20);
		System.out.println("Length : " + rect.l);
		System.out.println("Breadth : " + rect.b);
		System.out.println("\n\nArea : " + rect.getArea());
		System.out.println("Perimeter : " + rect.getPerimeter());

	}
	
}
class Rect {
	double l, b;
	 Rect(double l, double b) {
		this.l = l;
		this.b = b;
	}
	 
	double getArea() {
		return l * b;
	}
	
	double getPerimeter() {
		return 2 * (l + b);
	}
}
