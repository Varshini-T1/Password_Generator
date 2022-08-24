
package password_generator;

import java.util.Scanner;
import java.util.Random;
public class Password_generator {
    
    public static void passwordGeneratorWithSplChars(int length)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_";
        
        String password = letters+numbers+specialCharacters;
        Random r = new Random();
        char[] passwordGenerated = new char[length];
        
        for(int i=0;i<length;i++)
        {
            passwordGenerated[i] = password.charAt(r.nextInt(password.length()));
        }
        System.out.println(passwordGenerated);
    }

    public static void passwordGeneratorWithoutSplChars(int length)
    {
         String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        
        String password = letters+numbers;
        Random r = new Random();
        char[] passwordGenerated = new char[length];
        
        for(int i=0;i<length;i++)
        {
            passwordGenerated[i] = password.charAt(r.nextInt(password.length()));
        }
        System.out.println(passwordGenerated);
  
    }
    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
       
       int length = input.nextInt();
       
       System.out.println("Do you want to include special characters in the password ? Choose yes or no : Y/N");
       char decision = input.next().charAt(0);
       
       switch(decision)
       {
           case 'Y':
               passwordGeneratorWithSplChars(length);
               break;
           case 'y':
               passwordGeneratorWithSplChars(length);
               break;
           case 'N':
               passwordGeneratorWithoutSplChars(length);
               break;
           case 'n':
               passwordGeneratorWithoutSplChars(length);
               break;
      
       }
      
      
    }
    
}
