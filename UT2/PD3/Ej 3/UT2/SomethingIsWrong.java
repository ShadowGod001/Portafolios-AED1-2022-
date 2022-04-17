package UT2;
import UT2.Rectangle;

public class SomethingIsWrong {
	
	public static void main(String[] args) {
		/*
		Rectangle myRect; //La clase Rectangle no existe
		myRect.width = 40;
		myRect.height = 50;
		System.out.println("myRect's area is " + myRect.area());
		*/
		
		Rectangle myRect = new Rectangle(40,50); //La clase Rectangle no existe
		System.out.println("myRect's area is " + myRect.getArea()); //Salida = myRect's area is 2000
	}
}