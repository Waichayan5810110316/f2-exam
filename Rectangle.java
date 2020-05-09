public class Rectangle extends Shape2D {	//concrete class
    private double area;
    private double height;
    private double width;

	public Rectangle(String name, double width ,double height){
    
        super(name);
        this.width = width;
        this.height = height;
        
    }

	public double getwidth(){
		return width;
    }
    
    public double getheight(){
        return height;
    }

	public void setwidth(double width){
		this.width = width;
    }
    
    public void setheight(double height){
        this.height = height;
    }


	public double getArea(){
        area = width * height ;
        return area;
	}


} 