package UT2;

public class NumberHolder {
	
	public int anInt;
	public float aFloat;

	public static void main(String[] args) {
		
		NumberHolder number = new NumberHolder();
		number.anInt = 10;
		number.aFloat = 10.3f;
		
		System.out.println("El valor de anInt es: " + number.anInt);
		System.out.println("El valor de aFloat es: " + number.aFloat);

	}

}
