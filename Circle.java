public class Circle extends Shape2D {	//concrete class
    private double radius;
    private double area;

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}


	public double getArea(){
        area = radius * radius * Math.PI;
        return area;
	}


} 