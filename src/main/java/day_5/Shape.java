package day_5;

public abstract class Shape {
	private String color = "red";
	
	public Shape() {
		
	}
	
	public abstract void draw();
	
	public String color() {
		return color;
	}
}
