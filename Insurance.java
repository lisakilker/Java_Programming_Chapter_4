/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2HW;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Lisa
 */
public class Insurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar currentDayAndTime = new GregorianCalendar();
        
        int year = currentDayAndTime.get(GregorianCalendar.YEAR);
        
        String stringCurrentYear;
        String stringBirthYear;
        
        int currentYear;
        int birthYear;
       
        stringCurrentYear = JOptionPane.showInputDialog(null, "What is the current year?");
        stringBirthYear = JOptionPane.showInputDialog(null, "What year were you born?");
        
        currentYear = Integer.parseInt(stringCurrentYear);
        birthYear = Integer.parseInt(stringBirthYear);
        
        int currentAgeResult = year - birthYear;
        JOptionPane.showMessageDialog(null, "Your age this year will be " + currentAgeResult);
        
        int premiumResult = ((currentAgeResult/10)+15)*20;
        JOptionPane.showMessageDialog(null, "Your premium is $" + premiumResult);
       
    }
    
}
