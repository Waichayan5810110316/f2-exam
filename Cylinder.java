public class Cylinder extends Shape3D{

        private double area;
        private double radius;
        private double height;
        private double volumn;
    
        public Cylinder(String name, double radius ,double height){
        
            super(name);
            this.radius = radius;
            this.height = height;
            
        }
    
        public double getRadius(){
            return radius;
        }
    
        public void setRadius(double radius){
            this.radius = radius;
        }

        public void setHeight(double height){
            this.height = height;
        }
    
    
        public double getArea(){
            area =  radius * Math.PI * 2 * height;
            return area;
        }
        
        public double getVolumn(){
            volumn = Math.PI * radius * radius * height;
            return volumn;
        }
        
    
}
    
