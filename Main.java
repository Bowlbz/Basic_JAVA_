
/**
 * Write a description of class Main here.
 * Practice Basic Java Coding
 * @author David Jason Bowlby
 * @version December 8, 2019
 */

import java.util.Scanner;
public class Main
{
   //Function Definitions (Can be above or Below Main ****
   public static double calcSquare(double n)
   {
       return n * n;
   }
    
   
   public static void main(String[] args) //"int Main()" in C++
   {
       Scanner in = new Scanner(System.in); //Scanner to input data
       //Declared Variablies ***
       int inputAge = 0, exit = 0;
       double number = 0.0, width = 0.0, length = 0.0, area = 0.0;
       
       while(exit != 1)
       {
         System.out.println("\nThis Program will compare your age ");
         System.out.println("to Dr.T's age using (IF) statments. ");
           while(true)
           {
               System.out.println("\nWhat is your AGE: ");
               try
               {
                   inputAge = Integer.parseInt(in.next());
                   break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("\nInvalid Input: Try Again");
               }
           }     
               //IF statment to determine OUTPUT to screen***
            if(inputAge > 36)
               {
                   System.out.println("\nYou are OLDER than Dr.T ");
               }
               else if (inputAge < 36)
               {
                   System.out.println("\nYou are YOUNGER than Dr.T ");
               }
               else if (inputAge == 36)
               {
                   System.out.println("\nYou are the SAME AGE as Dr.T ");
               }   
               
           
           System.out.println("\nWould you like to compare again?");
           System.out.println("Type 1 to Exit, Any other Key to REPEAT");
           while(true)
           {
               try
               {
                   exit = Integer.parseInt(in.next());
                   break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("Invalid Input: Please Try Again");
               }
           }
       }
       
       System.out.println("\nEnjoy the Next Program ***** ");
       exit = 0; //reset EXIT for next Program ****
       
       //Program #2 ********
       while(exit != 1)
       {
           System.out.println("\nThis Program will give you the Square ");
           System.out.println("Multiple of your Number");
           while(true)
           {
               System.out.println("\nPlease Enter a Number: ");
               try
               {
                   number = Double.parseDouble(in.next());
                   break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("\nInvalid Input: Please Try Again ");
               }
           }
           System.out.println("Your number is: " + number);
           System.out.println(number + " * " + number + " = " + calcSquare(number));
           System.out.println("\nWould you like to Square another Number?");
           System.out.println("Type 1 to Exit, Any other Key to repeat: ");
           while(true)
           {
               try
               {
                   exit = Integer.parseInt(in.next());
                   break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("Invalid Input: Please Try Again");
               }
           }
       } 
       
       System.out.println("\nEnjoy the Next Program ****");
       
       //Program #3 **********
       Rectangle r = new Rectangle(width, length);//Instantiate Rectangle r from class Rectangle
       exit = 0; //RESET exit to 0
       while(exit != 1)
       {
           System.out.println("\nThis Program will give you the AREA of a Rectangle");
           while(true)
           {
               System.out.println("\nWhat is the WIDTH: ");
               try
               {
                  width = Double.parseDouble(in.next());
                  break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("Invalid Input: Please Try Again");
               }
           }
           
           r.setWidth(width);//set Value to Width
           
            while(true)
           {
               System.out.println("\nWhat is the LENGTH: ");
               try
               {
                length = Double.parseDouble(in.next());//User input
                break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("Invalid Input: Please Try Again");
               }
           }
           
           r.setLength(length);//set Value to Length
           
           System.out.println("\nYour Width is: " + r.getWidth() );//Display Value
           System.out.println("Your Length is: " + r.getLength());//Display Value
       
           System.out.println("\nThe AREA of your RECTANGLE is:" + r.area(width,length));
           System.out.println("\nWould you like to Calculate another Rectangle?");
           System.out.println("Type 1 to Exit or ANY other Number to Repeat: ");
           while(true)
           {
               try
               {
                   exit = Integer.parseInt(in.next());
                   break;
               }
               catch(NumberFormatException ignore)
               {
                   System.out.println("Invalid Input: Please Try Again");
               }
           }
           
           System.out.println("\nI hope you've enjoyed this Program in Java");
        }
       
    }
   
   
   
   
}
