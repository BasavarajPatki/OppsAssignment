package com.test;
import com.shape.*;

public class PolygonDemo {

	public static void main(String[] args) {
		Square s1=new Square(5);
		Rectangle r1=new Rectangle(4, 5);
		
		s1.calcArea();
		s1.calcPeri();
		r1.calcArea();
		r1.calcPeri();
	}

}
