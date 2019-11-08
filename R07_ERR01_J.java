
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/******************************************************************************
 *  Compilation:  javac R07_ERR01_J.java
 *  Execution:    java R07_ERR01_J filename
 *  Exception Error
 ******************************************************************************/




/**
 *
 * @author sonut
 */

  public class R07_ERR01_J {
      

    public static void main(String[] args) {
        
     File file = null;
    try {
      file = new File(System.getenv("APPDATA") +
             args[0]).getCanonicalFile();
      if (!file.getPath().startsWith("c:\\homepath")) {
        System.out.println("Invalid file");
        return;
      }
    } catch (IOException x) {
      System.out.println("Invalid file");
      return;
    }
 
    try {
      FileInputStream fis = new FileInputStream(file);
    } catch (FileNotFoundException x) {
      System.out.println("Invalid file");
      return;
    }
    
      
      
      
    }
  }
