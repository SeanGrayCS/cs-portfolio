/**
 * DerivativeRunner.java
 *
 * @author Sean Gray
 * 
 * @version 1.03 2019/9/27
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class DerivativeRunner {

	public static void main(String[] args) {
    	
    	//set up keyboard scanner
    	Scanner keyboard = new Scanner(System.in);
    	
    	char continueProgram = 'y';
    	while(continueProgram == 'y' || continueProgram == 'Y') 
    	{
    		
    		//get inputs
    		String userInput = "";
    		System.out.println("Please type your equation without spaces(ex: y=5x): ");
    		userInput = keyboard.next();
    		
    		//derive
    		BasicDerivativeCalc deriv = new BasicDerivativeCalc(userInput);
    			
    		System.out.println("Input:");
 	   		System.out.print(userInput);
    		System.out.println("Derivative: ");
    		System.out.print(deriv.deriveEquation());
    		
    		System.out.println("Continue?(y/n): ");
    		continueProgram = keyboard.next().charAt(0);
    	}
    }
    
}