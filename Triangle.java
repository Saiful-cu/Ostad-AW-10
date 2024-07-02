package Shapes;

public class Triangle extends Shape {
	
	private double  height;
	private double length;
	private double area = 0;

	public Triangle(double height, double length) {
		this.height = height;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Draw a Triangle");
		
	}

	@Override
	public double calculateArea() {
		
		area = 0.5 * height * length;
		System.out.println("Area of the trinagle is : "+ area);
		
		return 0;
	}

}
