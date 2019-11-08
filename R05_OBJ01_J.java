
/******************************************************************************
 *  Compilation:  javac R05_OBJ01_J.java
 *  Execution:    java R05_OBJ01_J
 *  Print integer till its max value
 ******************************************************************************/




/**
 *
 * @author sonut
 */

public class R05_OBJ01_J {
      
  private static int total = 1111111; // Number of elements
 
  static void add() {
    if (total < Integer.MAX_VALUE) {     
      total++;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
    
    System.out.println(total);
  }
 
  static void remove() { 
    if (total > 0) {     
      total--;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
    
    System.out.println(total);
  }  
  
  public static int getTotal () {
    return total;
  }
    public static void main(String[] args) {
        
     
      add();
      remove();
      
      
      
    }
  }
