import java.util.Scanner;

public class Message {

   public static void main(String[] args) { 
		
      Scanner scnr = new Scanner(System.in);
		
      String input;
      String message = "";
      int checksum = 0;
		
      System.out.print("What is your message? ");
      input = scnr.nextLine();
      
      input = input.toUpperCase();
		
      for (int i=0; i < input.length(); ++i) {
         if (i == (input.length() - 1)) {
        	message += (input.charAt(i) - 64);
            checksum += input.charAt(i);
         } 
         else {
        	message += (input.charAt(i) - 64) + "-";
            checksum += input.charAt(i);
         }
      }		
      System.out.println("Your encoded message is " + message);
      System.out.println("Message checksum is " + checksum);
		
      scnr.close();	
   }
}