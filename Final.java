import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class Final {
    public static void main(String[] args) {
        ArrayList<Shape2D> shape2ds = new ArrayList<Shape2D>();
        ArrayList<Shape3D> shape3ds = new ArrayList<Shape3D>();
 
        try{
        Scanner sc = new Scanner(new File("C:\\Users\\User\\Desktop\\f2-exam\\file.txt"));
           
            while(sc.hasNextLine()){
            String key = "" ;
            String currentline = "";
            double w = 0;
            double r = 0;
            double h = 0;
            double d = 0;
            int indexw=0;
            int indexh;
            int indexd;
            int indexr;
            
            currentline = sc.nextLine();
            System.out.println(currentline);
            if(currentline.contains("W")){ 
               indexw =  currentline.lastIndexOf("W"); 
               w = Double.parseDouble(currentline.substring(indexw+1, indexw+3));
               //System.out.println(w);
                if(currentline.contains("H")){
                   
                    indexh =  currentline.lastIndexOf("H");
                   // System.out.println(currentline.substring(indexw+1, indexw+3));
                  
                    h = Double.parseDouble(currentline.substring(indexh+1, indexh+3));
                   // System.out.println(h);
                    if(currentline.contains("D")){
                        
                      
                        indexd =  currentline.indexOf("D");
                      // System.out.println(currentline.substring(indexd+2, indexd+3));
                        
                        d = Double.parseDouble(currentline.substring(indexd+2, indexd+3));
                        //System.out.println(indexd);
                        shape3ds.add(new Cuboid(currentline.substring(0,1),w,h,d));
                        System.out.println("cuboid w = "+ w +"h ="+ h + "d = "+ d);
                    }
                    else{
                        w = Double.parseDouble(currentline.substring(indexw+1, indexw+3));
                        h = Double.parseDouble(currentline.substring(indexh+1, indexh+3));
                        shape2ds.add(new Rectangle(currentline.substring(0,1),w,h));
                        System.out.println("rec w =" + w + "h = "+ h);
                    }
                }
                
            }
            else if(currentline.contains("R")){
               indexr =  currentline.lastIndexOf("R");
               r = Double.parseDouble(currentline.substring(indexr+1, indexr+3));
              // System.out.println(currentline.substring(indexr+1, indexr+3));

               //System.out.println(indexr);
               if(indexr > 7){
                   System.out.println("Sphere r ="+ r);
                   shape3ds.add(new Sphere(currentline.substring(0,1),r));
               }
               else if(currentline.contains("H")){
                indexh =  currentline.lastIndexOf("H");
                //System.out.println(currentline.substring(indexh+1, indexh+3));
                h = Double.parseDouble(currentline.substring(indexh+1, indexh+3));
                   System.out.println("Cylinder h ="+ h + "r=" + r);
                   shape3ds.add(new Cylinder(currentline.substring(0,1),r,h));
                }
                else{
                   System.out.println("Circle r ="+ r);
                   shape2ds.add(new Circle(currentline.substring(0,1),r));
               }
            }
            

            
           
        }
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }catch(Exception exception){
            System.out.println("something Wrong!!!");
        }for(Shape2D s : shape2ds){
                System.out.println(s.getName());
            }
            for(Shape3D s : shape3ds){
                System.out.println(s.getName());
            }
        Scanner s2 = new Scanner(System.in);
        String key = s2.nextLine();
        
        for(Shape2D s : shape2ds){
            int totalarea = 0;
            if(s.getName()==key){

            }
        }
    }
}