/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;

/*
Braden Niksich
This program displays factorials of the integer the user inputs.
 */

//Importing java Scanner.
import java.util.Scanner;

public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating scanner oject to read user inputs.
        Scanner input = new Scanner(System.in);
        
        //Setting up variables and initalizing them.
        int factorialCounter = 0;
        int factorial = 1;
        int factorialResult = 1;
        
        //Initial prompt for user to enter an integer.
        System.out.println("Welcome! This program calculates factorials!");
        System.out.print("Please input an integer: ");
        
        //Reads the integer the user inputs into the system.
        int userInput = input.nextInt();
        
        //While loop. Begins since factorialCounter has initial value of 0.
        while (factorialCounter < userInput)
        { 
            //Equation for finding the factorial of user picked integer.
            factorialResult = factorialResult * factorial;
            
            //Adding one to the factorial.
            factorial = factorial + 1;
            
            //If user inputs a 0, then the factorial result will be 1.
            if (userInput == 0)
                factorialResult = 1;
            
            //Loops as money times as the user inputs and then breaks.
            factorialCounter = factorialCounter + 1;
        }
        //Prompt displaying the factorial result of the number of the user input.
        System.out.printf("The factorial of %d is: %d", userInput, factorialResult);
        //Prompt thanking user for using the program.
        System.out.println("\nThanks for using this application!");
    }
    
}
