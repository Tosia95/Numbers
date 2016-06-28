import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class Conventer {
public static void main()
{
    binaryToDecimal();
}
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
public static void decimalToBinary()
    {
    Scanner read = new Scanner(System.in);
    //Odebranie od uzytkownika liczby dziesiętnej
    System.out.println("Please enter the decimal number to convert: ");
    String decimalCode = read.nextLine();
    System.out.println(decimalCode);
    int decimalValue = Integer.parseInt(decimalCode);
    
    while (int count != 100)
    {
        int[] binaryValue = new int[count];
        if (decimalValue%2 = 1)
        {
            binaryValue[count] = 1;
            decimalValue = decimalValue / 2;
            if (decimalValue == 0)
            {
                count = 100;
            }
            count++;
        }
        if (decimalValue%2 = 0)
        {
            binaryValue[count] = 0;
            decimalValue = decimalValue / 2;
            if (decimalValue == 0)
            {
                count = 100;
            }
            count++;
        }
        
       }
   
    }
}


