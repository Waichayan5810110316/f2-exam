public class Cuboid extends Shape3D{

    private double area;
    private double width;
    private double height;
    private double depth;
    private double volumn;

    public Cuboid(String name, double width ,double height,double depth){
    
        super(name);
        this.width = width;
        this.height = height;
        this.depth = depth;       
    }

    public double getwidth(){
        return width;
    }

    public void setwidth(double width){
        this.width = width;
    }

    public double getHeigth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getdepth(double depth){
        return depth;
    }

    public void setdepth(double depth ){
        this.depth = depth;
    }




    public double getArea(){
        area = (depth * height * 2) + (2 * width * height) + (2 * width * depth);
        return area;
    }
    
    public double getVolumn(){
        volumn =  width * depth * height;
        return volumn;
    }
    

}