
import java.io.File;


/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *  Delete check
 ******************************************************************************/

/**
 *
 * @author sonut
 */
public class R02_XP00_J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    deleteFile();
  }
    
    
    public static void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  
          
  if (!someFile.delete()) {
      
       System.out.println("Delete UnSuccessful");
  }
  else
     System.out.println("Delete Successful");
      
 
}

 }


// Output : Delete UnSuccessful
