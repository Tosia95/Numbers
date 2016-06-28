import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class Conventer {
public static void main()
{
    binaryToDecimal();
}
/*
 * Metoda zamieniająca liczbę w systemie binarnym na liczbę w systemie dziesiętnym
 */
public static void binaryToDecimal() 
{
    Scanner read = new Scanner(System.in);
    //Odebranie od uzytkownika liczby binarnej
    System.out.println("Please enter the binary code to convert: ");
    String binaryCode = read.nextLine();
    
    int binaryCodeLength = binaryCode.length();
    int binaryCodeIndex = binaryCode.length() - 1;
    int decimalValue = 0;
    
    for (int count = 0; count < binaryCodeLength; count++)
    {
        //Odczytywanie wartosci numerycznej kazdego znaku - pojedynczy znak = 1 bit
        int number = Character.getNumericValue(binaryCode.charAt(count));
        
        //Przeliczenie liczby w systemie binarnym na dziesiętny. 
        //decimalPart = wartosc jednego bitu
        int bitValue = number * (int) Math.pow(2,  binaryCodeIndex);
        
        //sumowanie wartosci kazdego bitu
        decimalValue += bitValue;
        
        //zmiejszanie wartosci indeksu; indeks = numer bitu
        binaryCodeIndex -=1;
    }
    
    System.out.println("Decimal format: " + decimalValue);
                  
    }
    /*
     * Metoda zamieniająca liczbę dzięsiętna na liczbę w systemie binarnym
     */
public static void decimalToBinary()
    {
    Scanner read = new Scanner(System.in);
    //Odebranie od uzytkownika liczby dziesiętnej
    System.out.println("Please enter the decimal number to convert: ");
    int decimalValue = read.nextInt();
    
    ArrayList<Integer> binaryValues = new ArrayList<>();
    
    while (decimalValue != 0)
    {
       //Obliczenie reszty z dzielenia
        int binaryValue = decimalValue % 2;
        //dodanie reszty do listy
        binaryValues.add(binaryValue);
        //dzielenie wartosci dziesietnej przez 2
        decimalValue = decimalValue / 2;
       }
   //odwrócenie kolejnosci elementów
   Collections.reverse(binaryValues);
   //zamiana Arraylist na tablice
   binaryValues.toArray();
   
   System.out.println("Binary format: " + binaryValues);
   
    }
}


