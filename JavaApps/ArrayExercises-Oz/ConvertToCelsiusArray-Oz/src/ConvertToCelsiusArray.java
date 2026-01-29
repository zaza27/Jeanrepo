import java.util.Scanner;
 
/*
 * Write a program to convert degrees Fahrenheit
 * into degrees Celsius , (i.e. integer result),
 * for 3 fixed integer amounts. Use the formula
 *      C = (5.0/9.0) * (F-32.0)
*/
 
public class ConvertToCelsiusArray {
     
   public static void main(String[] args) {
       int [] fDegreesArray = {32,72,212};
         
       System.out.println(); 
       System.out.println(calculateCelsius(fDegreesArray[0]) + "\n"); 
        
       System.out.println(); 
       System.out.println(calculateCelsius(fDegreesArray[1]) + "\n");
       
       System.out.println(); 
       System.out.println(calculateCelsius(fDegreesArray[2]) + "\n");
   }
 
    private static String calculateCelsius(int fDegrees) {
       int cDegrees = 0;
       String midText = " Degrees Fahrenheit is ";
       String endText = " degrees Celsius.";
       String finalText = "";
 
       cDegrees = (int)((5.0/9.0) * ( fDegrees - 32.0 ));
       finalText = fDegrees + midText + cDegrees + endText; 
       return finalText;
    }
 
}