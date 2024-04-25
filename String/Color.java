package String;

import java.util.*;

import Interface.Main;


public class Color {


public boolean checkSameAppearance(String stng) {
 int l = stng.length(); 
 int red = 0;
 int blue = 0; 


 for (int i = 0; i < l - 2; i++) {
   String tmp = stng.substring(i, i + 3); 


   if (tmp.compareTo("red") == 0)
     red++; 
 }

 
 for (int i = 0; i < l - 3; i++) {
   String tmp = stng.substring(i, i + 4);
  
   if (tmp.compareTo("blue") == 0)
     blue++; 
 }


 if (red == blue)
   return true; 
 else
   return false;
}


public static void main(String[] args) {
 Main m = new Main(); 

 String str1 = "redcapmanwithbluecar";

 
 System.out.println("The given string is: " + str1);
 System.out.println("The appearance of red and blue are same: " + m.checkSameAppearance(str1));
}
}
