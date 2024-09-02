import java.util.Scanner;

public class carlyseventprice{
   
   public static void main(String[] args){
   
      int PRICE_PER_GUESTS = 35;
      int LARGE_EVENT = 50;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("**************************************");
      System.out.println(" * Carly's makes the food that makes *");
      System.out.println(" *            ita party.             *");
      System.out.println("**************************************");
      System.out.println("Welcome to Carly's Catering Enjoy the special occasion! Thank you ");
      
      System.out.print("Enter the number of guest: ");
      int numberOfGuests = scanner.nextInt();
      
      double totalPrice = numberOfGuests * PRICE_PER_GUESTS;
      boolean isLargeEvent = numberOfGuests >= LARGE_EVENT;
      
      System.out.println("Number of guest: "+ numberOfGuests);
      System.out.println("Price per guest: "+ PRICE_PER_GUESTS);
      System.out.println("Total price: "+ totalPrice);
      System.out.println("Is this a Large Event? "+ isLargeEvent);
   }
}
