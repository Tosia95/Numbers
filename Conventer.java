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
    System.out.println(binaryCode);
    
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
    String decimalCode = read.nextLine();
    System.out.println(decimalCode);
    
    //zamiana String na Integer
    int decimalValue = Integer.parseInt(decimalCode);
    int counter = 0;
    
    //tablica, do którego wpisywane będą warotsci bitów
    int[] binaryValue = new int[counter];
    while (counter != 100)
    {
        //warunki obliczające wartosc kazdego bitu
        //podziel wartosc dziesietną przez 2
        //jesli reszta z dzielenia rowna 1 wpisz do tablicy 1, analogicznie w przypadku wartosci zero
        //jesli wartosc dziesietna osiagie wartosc zero, program wychodzi z pętli
        if (decimalValue % 2 == 1)
        {
            decimalValue = decimalValue / 2;
            binaryValue[counter] = 1;
            if (decimalValue == 0)
            {
                counter = 100;
            }
            counter++;
        }
        if (decimalValue % 2 == 0)
        {
            decimalValue = decimalValue / 2;
            binaryValue[counter] = 0;
            if (decimalValue == 0)
            {
                counter = 100;
            }
            counter++;
        }
       }
   
   for (int i =0; i < (binaryValue.length/2); i++)
   {
       binaryValue[i] = binaryValue[binaryValue.length - i];
    }
    System.out.println("Binary format: " + binaryValue);
    }
}


