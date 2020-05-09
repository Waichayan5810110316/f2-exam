public class Sphere extends Shape3D{
    private double area;
    private double radius;
    private double volumn;

	public Sphere(String name, double radius){
    
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
        area = radius * radius * Math.PI * 4 ;
        return area;
    }
    
    public double getVolumn(){
        volumn = 4 * Math.PI * radius * radius * radius / 3 ;
        return volumn;
    }
    
}