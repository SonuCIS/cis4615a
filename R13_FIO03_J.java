
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


/******************************************************************************
 *  Compilation:  javac R13_FIO03_J.java
 *  Execution:    java R13_FIO03_J
 *  Creates file and shows error if already created
 ******************************************************************************/

/**
 *
 * @author sonut
 */

  public class R13_FIO03_J {
      

    public static void main(String[] args) throws IOException{
    File f = new File("tempnam.tmp");
    if (f.exists()) {
      System.out.println("This file already exists");
      return;
    }
 
    FileOutputStream fop = null;
    try {
      fop = new FileOutputStream(f);
      String str = "Data";
      fop.write(str.getBytes());
    } finally {
      if (fop != null) {
        try {
          fop.close();
        } catch (IOException x) {
          // Handle error
        }
      }
    }
  }
  }
