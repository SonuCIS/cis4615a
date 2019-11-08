
/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *  Rule 00 Sanitize user input
 ******************************************************************************/

import java.util.regex.Pattern;


/**
 *
 * @author sonut
 */
public class R00_IDS03_J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
     boolean loginSuccessful = false;  
     String username = "Sonu Thummar";
        
   
     
      if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
  }

      public static String sanitizeUser(String username) {
       return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
         
}
    
    
     public static class logger {
            
       public static void severe ( String str) {
       
           System.out.println(str);
         
       }          
    }       
 }


// Output : User login failed for: unauthorized user
