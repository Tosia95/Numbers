import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
import java.lang.Integer;
import java.lang.System;
import java.lang.Character;

public class Conventer {
    
public static void main()
{
   Scanner in = new Scanner(System.in);
   //tworzenie separatora linii tekstu
   String newLine = System.getProperty("line.separator");
   while (true)
   {
       System.out.println("Please select:" + newLine + "[1] to convert binary number to decimal number" + newLine + 
       "[2] to convert decimal number to binary number" + newLine + "[3] to exit the program");
       int choice = in.nextInt();
       switch (choice)
       {
           case 1:
                binaryToDecimal();
                break;
           case 2:
                decimalToBinary();
                break;
           case 3:
                System.out.println("Exit");
                System.exit(0);
                break;
           default:
                System.out.println("Invalid selection");
                break;
       }
      
}
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
    
    ArrayList<Integer> binaryValues = new ArrayList<Integer>();
    
    while (decimalValue != 0)
    {
       //Obliczenie reszty z dzielenia
        int bitValue = decimalValue % 2;
        //dodanie reszty do listy
        binaryValues.add(bitValue);
        //dzielenie wartosci dziesietnej przez 2
        decimalValue = decimalValue / 2;
       }
   //odwrócenie kolejnosci elementów
   Collections.reverse(binaryValues);
   //zamiana Arraylist na tablice
   Integer[] binaryArray = binaryValues.toArray(new Integer[binaryValues.size()]);
   
   int number = 0;
   String newLine = System.getProperty("line.separator");
   
   System.out.println("Binary format: ");
   
   for (int i = 0; i < binaryArray.length; i++)
   {
       number = Integer.parseInt(String.valueOf(binaryArray[i]));
       System.out.print(number);
    }
    System.out.println(newLine);
    }
    /*
     * Metoda zamienijąca liczbę w systemie dzisiętnym na liczbie w systemie szesnastkowym
     */
public static void decimalToHex ()
    {
        Scanner read = new Scanner(System.in);
    //Odebranie od uzytkownika liczby dziesiętnej
    System.out.println("Please enter the decimal number to convert: ");
    int decimalValue = read.nextInt();
    
    ArrayList<Character> hexValues = new ArrayList<Character>();
    
    while (decimalValue != 0)
    {
       //Obliczenie reszty z dzielenia
        int hexValue = decimalValue % 16;
        if (hexValue <10)
            {
                char b = Integer.toString(hexValue).charAt(0);
                //dodanie reszty do listy
                hexValues.add(b);
        }   
        else if (hexValue == 10)
            {
                hexValues.add('A');
            }
        else if (hexValue == 11)
                {
                hexValues.add('B');
            }
        else if (hexValue == 12)
            {
                hexValues.add('C');
            }
        else if (hexValue == 13)
            {
                hexValues.add('D');
            }
        else if (hexValue == 14)
            {
                hexValues.add('E');
            }
        else if (hexValue == 15)
            {
                hexValues.add('F');
            }
    
        //dzielenie wartosci dziesietnej przez 2
        decimalValue = decimalValue / 16;
       }
       Collections.reverse(hexValues);
       
       Character[] hexArray = hexValues.toArray(new Character[hexValues.size()]);
       
       String hexNumber = "";
       
       for (Character s : hexArray)
        {
       hexNumber += s;
    }
       System.out.println("Hexadecimal format: 0x" + hexNumber);
    }
    /*
 * Metoda zamieniająca liczbę w systemie szesnastkowym na liczbę w systemie dziesiętnym
 */
public static void hexToDecimal() 
{
    Scanner read = new Scanner(System.in);
    //Odebranie od uzytkownika liczby binarnej
    System.out.println("Please enter the binary code to convert: ");
    String hexCode = read.nextLine();
    
    int hexCodeLength = hexCode.length();
    int hexCodeIndex = hexCode.length() - 1;
    int decimalValue = 0;
    int remainder = 0;
    char[] number = hexCode.toCharArray();
    
    for (int count = 0; count < hexCodeLength; count++)
    {
       if (number[count]=='0'&&number[count]=='1'&&number[count]=='2'&&number[count]=='3'
       &&number[count]=='4'&&number[count]=='5'
       &&number[count]=='6'&&number[count]=='7'&&number[count]=='8'&&number[count]=='9')
       {
           remainder = Integer.parseInt(new String(number));
        }
       else if (number[count] == 'A')
       {
           remainder = 10;
        }
        else if (number[count] == 'B')
       {
           remainder = 11;
        }
        else if (number[count] == 'C')
       {
           remainder = 12;
        }
        else if (number[count] == 'D')
       {
           remainder = 13;
        }
        else if (number[count] == 'E')
       {
           remainder = 14;
        }
        else if (number[count] == 'F')
       {
           remainder = 15;
        }
        
        //Przeliczenie liczby w systemie binarnym na dziesiętny. 
        //decimalPart = wartosc jednego bitu
        int hexValue =  remainder * (int) Math.pow(16,  hexCodeIndex);
        
        //sumowanie wartosci kazdego bitu
        decimalValue += hexValue;
        
        //zmiejszanie wartosci indeksu; indeks = numer bitu
        hexCodeIndex -=1;
    }
    
    System.out.println("Decimal format: " + decimalValue);
                  
    }
}


