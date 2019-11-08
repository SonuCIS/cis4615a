

import java.math.BigInteger;



/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 * String rule for BigInteger
 ******************************************************************************/




/**
 *
 * @author sonut
 */
public class R04_STR03_J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray); 
        x = new BigInteger(ns);
        System.out.println(x);
        
        
  }
    
    
    
 

 }


