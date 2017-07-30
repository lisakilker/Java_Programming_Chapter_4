/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2HW;
import java.util.Scanner;
//import W2HW.CarlysEventPriceWithMethods;
import W2HW.Event;


/**
 *
 * @author Lisa
 */
public class EventDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eventNum;
        int guests;
        
        Event eventOneDetails = new Event();
        eventNum = getEventNumber();
        guests = getNumberOfGuests();
        
        Event eventTwoDetails = new Event(eventNum, guests);
        
        displayEventDetails(eventOneDetails);
        displayEventDetails(eventTwoDetails);
    }
    
    public static String getEventNumber(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the event number: ");
        String eventNumber = input.nextLine();
        return eventNumber;
    }
    
    public static int getNumberOfGuests(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of guests: ");
        int numOfGuests = input.nextInt();
        displayMotto();
        return numOfGuests;
    }  
    
    public static void displayMotto(){
        System.out.println("**************************************************************");
        System.out.println("*******Carly's makes the food that makes it a party.**********");
        System.out.println("**************************************************************");
    }
        
    public static void displayEventDetails(Event eventOneDetails){
        
        if (eventOneDetails.getNumberOfGuests()>=Event.CUT_OFF_AMOUNT) {
            System.out.println("Your party is too large.");
        }
        else {
        System.out.println("--EVENT DETAILS--");
        System.out.println("Event number is: " + eventOneDetails.getEventNumber());
        System.out.println("Number of guests is: " + eventOneDetails.getNumberOfGuests());
        System.out.println("Total cost is: $" + eventOneDetails.getPrice());
        }
        
    }
          
}


