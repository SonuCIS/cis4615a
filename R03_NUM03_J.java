import java.io.DataInputStream;
import java.io.IOException;



/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J\
 *  Masking the integer with 32 One bits
 ******************************************************************************/


/**
 *
 * @author sonut
 */
public class R03_NUM03_J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
  
    DataInputStream dis = new DataInputStream(System.in);

   long digit;
    digit = getInteger(dis);
    
   System.out.println(digit);
    
        
  }
    
  public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}

 }
