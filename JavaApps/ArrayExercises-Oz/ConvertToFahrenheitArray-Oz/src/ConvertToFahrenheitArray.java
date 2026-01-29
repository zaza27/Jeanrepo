import java.util.Scanner;
 
/*
 * Write a program to convert degrees Fahrenheit
 * into degrees Celsius , (i.e. integer result),
 * for 3 fixed integer amounts. Use the formula
 *      C = (5.0/9.0) * (F-32.0)
*/
 
public class ConvertToFahrenheitArray {
     
   public static void main(String[] args) {
       int [] cDegreesArray = {0,21,100};
       
       System.out.println(); 
       System.out.println(calculateFahrenheit(cDegreesArray[0]) + "\n"); 
        
       System.out.println(); 
       System.out.println(calculateFahrenheit(cDegreesArray[1]) + "\n");
       
       System.out.println(); 
       System.out.println(calculateFahrenheit(cDegreesArray[2]) + "\n");
   }
 
     
    private static String calculateFahrenheit(int cDegrees) {
           int fDegrees = 0;
           String midText = " Degrees Celsius is ";
           String endText = " degrees Fahrenheit.";
           String finalText = "";
 
           // How I solved for fDegrees:
           // cDegrees = (int)((5.0/9.0) * ( fDegrees - 32.0 ));
           // cDegrees/(5.0/9.0) = ((5.0/9.0) * ( fDegrees - 32.0 ))/(5.0/9.0);
           // cDegrees/(5.0/9.0) = fDegrees - 32.0;
           fDegrees = (int) ( cDegrees /( 5.0 / 9.0) ) + 32;
           finalText = cDegrees + midText + fDegrees + endText; 
           return finalText;
    }
 
}