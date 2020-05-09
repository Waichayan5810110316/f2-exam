import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class Final {
    public static void main(String[] args) {
 
        try{
        Scanner sc = new Scanner(new File("C:\\Users\\User\\Desktop\\f2-exam\\file.txt"));
           String currentline = sc.nextLine();
           System.out.println(currentline);


        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }        
    }
}