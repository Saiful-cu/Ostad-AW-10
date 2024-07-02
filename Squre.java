package Shapes;

public class Squre extends Shape{
	
	private double length;
	private double area = 0;

	public Squre(double redius) {
		this.length = redius;
	}

	@Override
	public void draw() {
		System.out.println("Draw a Squre");
		
	}

	@Override
	public double calculateArea() {
		
		area = length * length;
		System.out.println("Area of the Squre is : "+ area);
		
		return 0;
	}

}
