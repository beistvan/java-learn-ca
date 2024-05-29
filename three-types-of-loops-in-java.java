import java.util.ArrayList;
import java.util.Arrays;

class Playground {

	public static void main(String[] args) {
  
    for (int i = 0; i < 3; i++) {
  	  System.out.println("Congrats on finishing Java loops!");
	}
	
	int wishes = 0;
	
	while (wishes < 3) {
	  System.out.println("I wish " + (wishes + 1) + ")... "); 
      wishes++;
    }
    
    String[] inventoryItems = new String[]{"scissor", "hammer", "screwdriver"};
    for (String inventoryItem : inventoryItems) {
      System.out.println(inventoryItem); 
    
    }
  }

}
