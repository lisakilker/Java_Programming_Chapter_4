/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2HW;
//import W2HW.CarlysEventPriceWithMethods;
import W2HW.EventDemo;

/**
 *
 * @author Lisa
 */

class Event{
    public static double PRICE_PER_GUEST = 35.00;
    public static int CUT_OFF_AMOUNT = 50;
    private String eventNumber;
    private int guests;
    private double price;
    
    public Event(){
        this("A000",0);
    }
    
    public Event(String eventNum, int guests){
       setEventNumber(eventNum);
       setGuests(guests);
    }

    public void setEventNumber(String eventNum){
        eventNumber = eventNum;
    }

    public void setGuests(int amountOfGuests){
        guests = amountOfGuests;
        price = guests*PRICE_PER_GUEST;
    }
 
    public String getEventNumber(){
        return eventNumber;
    }

    public int getNumberOfGuests(){
        return guests;
    }

    public double getPrice(){
        return price;
    }
}

 
