package UT2;

public class Rectangle {

	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getArea() {
		return this.height*this.width;
	}
}
