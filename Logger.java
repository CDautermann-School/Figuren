import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Write a description of class logger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Logger
{    
    public static void log(String msg){
        System.out.println(msg);
        PrintWriter StdOut = null;
        
        try{
            
            StdOut = new PrintWriter(new FileOutputStream(new File("stdout.txt"), true));
            
        }catch(java.io.FileNotFoundException exc){
            
            File f = new File("stdout.txt");
            f.getParentFile().mkdirs();
            try{
                f.createNewFile();
            }catch(java.io.IOException IOexc){
                //pass
            }
        }   
        
        StdOut.println(msg);
        StdOut.close();
    }
    
    public static void flush(String filename){
        
        Path path = FileSystems.getDefault().getPath("", filename);
        
        try{
            Files.deleteIfExists(path);
        }catch(java.io.IOException IOexc){
            //pass
            
        }
        
        
        File f = new File(filename);
        
        try{
            f.createNewFile();
        }catch(java.io.IOException IOexc){
                //pass
        }
        
        
    }
    
    
}
