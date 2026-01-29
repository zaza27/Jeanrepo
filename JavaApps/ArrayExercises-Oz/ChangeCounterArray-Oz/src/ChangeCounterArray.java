
/*
 * Write a program to convert an entered number of quarters,
 *  dimes, nickles, and pennies into Dollars and Cent.
 * 
 */
public class ChangeCounterArray {
 
    public static void main(String[] args) {
        int [][] changeArray = 
        	 	{{15, 5, 10, 12}
        		,{33, 25, 19, 24}
        		,{107,52,100, 7}};
    	
        System.out.println();
        System.out.println(countChange(changeArray[0]));
        System.out.println();
        System.out.println(countChange(changeArray[1]));
        System.out.println();
        System.out.println(countChange(changeArray[2]));
 
    }
 
    private static String countChange(int [] change) {
    	int quarters = change[0];
    	int dimes = change[1];
    	int nickles = change[2];
    	int pennies = change[3];
        String finalText = "";
 
        int quartValue = 25;
        String quarterPostText = " Quarters, ";
 
        int dimeValue = 10;
        String dimePostText = " Dimes, ";
 
        int nickleValue = 5;
        String nicklePostText = " Nickles, ";
 
        int pennyValue = 1;
        String pennyPostText = " Pennies is ";
 
        int dollarCount = 0;
        int dollarValue = 100;
        String dollarPostText = " dollars and ";
 
        int centValue = 0;
        String centPostText = " cents.";
 
        centValue = quarters * quartValue + dimes * dimeValue + nickles
                * nickleValue + pennies * pennyValue;
        dollarCount = centValue / dollarValue;
        centValue = centValue - dollarCount * dollarValue;
        finalText = quarters + quarterPostText + dimes + dimePostText + nickles
                + nicklePostText + pennies + pennyPostText + dollarCount
                + dollarPostText + centValue + centPostText;
 
        return finalText;
    }
 
}