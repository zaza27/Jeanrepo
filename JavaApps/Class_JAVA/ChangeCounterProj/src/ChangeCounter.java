
/*
* Write a program to convert a fixed number of quarters,
* dimes, nickles, and pennies into Dollars and Cent.
*
*/
public class ChangeCounter {

public static void main(String[] args) {
int quarterCount = 0;
int quartValue = 25;
String quarterPostText = " Quarters, ";

int dimeCount = 0;
int dimeValue = 10;
String dimePostText = " Dimes, ";

int nickleCount = 0;
int nickleValue = 5;
String nicklePostText = " Nickles, ";

int pennyCount = 0;
int pennyValue = 1;
String pennyPostText = " Pennies is ";

int dollarCount = 0;
int dollarValue = 100;
String dollarPostText = " dollars and ";

int centValue = 0;
String centPostText = " cents.";


// Output on the console:
// “15 Quarters, 5 Dimes, 10 Nickles, and 12 Pennies is d dollars and c cents."
quarterCount = 15;
dimeCount = 5;
nickleCount = 10;
pennyCount = 12;
centValue = quarterCount * quartValue + dimeCount * dimeValue +
nickleCount * nickleValue + pennyCount * pennyValue;
dollarCount = centValue/dollarValue;
centValue = centValue - dollarCount * dollarValue;
System.out.println(quarterCount + quarterPostText + dimeCount +
dimePostText + nickleCount + nicklePostText +
pennyCount + pennyPostText + dollarCount + dollarPostText +
centValue + centPostText);


// Output on the console:
// “33 Quarters, 25 Dimes, 19 Nickles, and 24 Pennies is d dollars and c cents."
quarterCount = 33;
dimeCount = 25;
nickleCount = 19;
pennyCount = 24;
centValue = quarterCount * quartValue + dimeCount * dimeValue +
nickleCount * nickleValue + pennyCount * pennyValue;
dollarCount = centValue/dollarValue;
centValue = centValue - dollarCount * dollarValue;
System.out.println(quarterCount + quarterPostText + dimeCount +
dimePostText + nickleCount + nicklePostText +
pennyCount + pennyPostText + dollarCount + dollarPostText +
centValue + centPostText);

// Output on the console:
// “107 Quarters, 52 Dimes, 100 Nickles, and 7 Pennies is d dollars and c cents."
quarterCount = 107;
dimeCount = 52;
nickleCount = 100;
pennyCount = 7;
centValue = quarterCount * quartValue + dimeCount * dimeValue +
nickleCount * nickleValue + pennyCount * pennyValue;
dollarCount = centValue/dollarValue;
centValue = centValue - dollarCount * dollarValue;
System.out.println(quarterCount + quarterPostText + dimeCount +
dimePostText + nickleCount + nicklePostText +
pennyCount + pennyPostText + dollarCount + dollarPostText +
centValue + centPostText);
}

}
