package com.miit.Interface;
import java.util.Scanner;
public class ShapeArea implements Area{

	@SuppressWarnings("resource")
	@Override
	public void Circle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double r = sc.nextDouble();
		double areaOfCircle = 3.142 * r * r;
		System.out.println("Area of the circle is " + areaOfCircle);
	}

	@SuppressWarnings("resource")
	@Override
	public void Square() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		double s = sc1.nextDouble();
		double areaOfSquare = s * s;
		System.out.println("Area of the square is " + areaOfSquare);
	}

	@SuppressWarnings("resource")
	@Override
	public void Rectangle() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle: ");
		double l = sc2.nextDouble();
		System.out.print("Enter the breadth of the Rectangle");
		double b = sc2.nextDouble();
		double areaOfRectangle = l * b;
		System.out.println("Area of the Rectangle is " + areaOfRectangle);
	}
	
	public static void main(String[] args) {
		ShapeArea calculate = new ShapeArea();
		calculate.Circle();
		calculate.Square();
		calculate.Rectangle();
	}

}
