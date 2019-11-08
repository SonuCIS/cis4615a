import java.security.SecureRandom;

/******************************************************************************
 *  Compilation:  javac R49_MSC02_J.java
 *  Execution:    java R49_MSC02_J
 *  Random Integers
 ******************************************************************************/

/**
 *
 * @author sonut
 */

  public class R49_MSC02_J {

public static void main (String args[]) {
  SecureRandom number = new SecureRandom();
  // Generate 20 integers 0..20
  for (int i = 0; i < 20; i++) {
    System.out.println(number.nextInt(21));
  }
}  

  }
