package Shapes;

public class Circle extends Shape{
	
	private double redius;
	private double area = 0;

	public Circle(double redius) {
		this.redius = redius;
	}

	@Override
	public void draw() {
		System.out.println("Draw a Circle");
		
	}

	@Override
	public double calculateArea() {
		
		area = 3.1416 * redius * redius;
		System.out.println("Area of the circle is : "+ area);
		
		return 0;
	}
	

}
