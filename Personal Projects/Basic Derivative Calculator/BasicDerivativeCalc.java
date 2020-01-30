/**
 * BasicDerivativeCalc.java
 *
 * @author Sean Gray
 * 
 * @version 1.04 2019/10/2
 */

//imports
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BasicDerivativeCalc {
	
	private String equation;
	
	public BasicDerivativeCalc(String input)
	{
		equation = input;
	}
	
	public static int untilNotInt(String clause, int j) {
		int k = j;
		if(k<clause.length()) {
			if(clause != null) {
				char thisClause = clause.charAt(j);
				int value = Character.getNumericValue(thisClause);
				if(value < 10) {
					k++;
					k = untilNotInt(clause, k);
				}
				else {
					return k;
				}
				return k;
			}
			return k;
		}
		return k;
	}
	
	//take the derivative of a list of clauses
	public static String clauseDerivative(String[] clauseList, char[] opList) {
		
		//convert each index of clauseList into it's own list by character
		String thisClauseList[] = new String[clauseList.length];
		for(int i=0;i<thisClauseList.length;i++) {
			thisClauseList[i] = clauseList[i];
		}
		String store = "";
		int first = 0;
		int counter = 0;
		List<String> currentClause = new ArrayList<String>();
		List<String> storeClauses = new ArrayList<String>();
		List<Character> opClause = new ArrayList<Character>();
		for(int i=0;i<opList.length;i++) {
			opClause.add(opList[i]);
		}

		//differentiate all clauses
		int endOfListConstant = 0;
		for(int i = 0;i<thisClauseList.length;i++) {
			for(int q = (currentClause.size() - 1);q>-1;q-=1) {
				currentClause.remove(q);
			}
			//separate one clause
			if(((thisClauseList[i].contains("x")) == true) || ((thisClauseList[i].contains("^")) == true)) {
				counter = 0;
				while(counter<thisClauseList[i].length()) {
					store = "";
					first = counter;
					if(thisClauseList[i].charAt(counter) == '^') {
						currentClause.add("" + (thisClauseList[i].charAt(counter)));				
					}
					else {
						
						counter = untilNotInt(thisClauseList[i], counter);
						for(int l=first;l<counter;l++) {
							store = store + thisClauseList[i].charAt(l);
						}
						currentClause.add(store);
						if(counter<thisClauseList[i].length()) {
							currentClause.add("" + (thisClauseList[i].charAt(counter)));				
						}
					}
					counter++;
				}
			}
			else {
				currentClause.add(thisClauseList[i]);
			}

			for(int j=0;j<currentClause.size();j++) {
				if(currentClause.get(j) == "") {
					currentClause.remove(j);
				}
			}

			//differentiate one clause
			String storeNextAll = "";
			for(int j=0;j<currentClause.size();j++) {
				storeNextAll = "";
				if((currentClause.get(j).charAt(0) == '^') && (currentClause.get(0).charAt(0) != 'x')) {
					for(int k=(j+1);k<currentClause.size();k++) {
						storeNextAll = storeNextAll + currentClause.get(k);
					}
					currentClause.set(0, ("" + (Integer.parseInt(storeNextAll) * (Integer.parseInt(currentClause.get(0))))));
					//exponent reduction
					if(Integer.parseInt(storeNextAll) == 2){
						currentClause.remove(j+1);
						currentClause.remove(j);
					}
					else {
						currentClause.set(j+1, "" + ((Integer.parseInt(storeNextAll))-1));
					}
					break;
				}
				else if(currentClause.get(j).charAt(0) == '^') {
					for(int k=(j+1);k<currentClause.size();k++) {
						storeNextAll = storeNextAll + currentClause.get(k);
					}
					currentClause.add(0, ("" + (Integer.parseInt(storeNextAll))));
					//exponent reduction
					if(Integer.parseInt(storeNextAll) == 2){
						currentClause.remove(j+2);
						currentClause.remove(j+1);
					}
					else {
						currentClause.set(j+2, "" + ((Integer.parseInt(storeNextAll))-1));
					}
					break;
				}
				else if((currentClause.get(j).charAt(0) == 'x') && (currentClause.size() <= (j+1)) && (currentClause.size() > 1)) {
					currentClause.remove(j);
					break;
				}
				else if((currentClause.get(j).charAt(0) == 'x') && (currentClause.size() == 1)) {
					currentClause.set(j, "" + 1);
					break;
				}
				else if((currentClause.get(j).charAt(0) != 'x') && (currentClause.size() == 1)) {
					currentClause.remove(j);
					if(i == (thisClauseList.length - 1)) {
						endOfListConstant = 1;
					}
					break;
				}

					
			}
			
			//adds the operator
			String operator = "";
			if((opClause.size() > 0) && (i<opClause.size())) {
				operator = "" + opClause.get(i);
				currentClause.add(currentClause.size(), operator);
			}
			
			//stores it
			store = "";
			for(int j=0;j<currentClause.size();j++) {
				store = store + currentClause.get(j);
			}
			storeClauses.add(store);
		}
		
		
		//put new clauses together into a string
		String result = "dy/dx=";
		for(int i=0;i<storeClauses.size();i++) {
			result = result + storeClauses.get(i);
		}
		if(endOfListConstant == 1) {
			String resultCopy = result;
			result = "";
			for(int i=0;i<(resultCopy.length() - 1);i++) {
				result = result + resultCopy.charAt(i);
			}
		}
		boolean hasX = true;
		if(thisClauseList.length == 1) {
			for(int i=0;i<thisClauseList[0].length();i++) {
				if(thisClauseList[0].charAt(i) == 'x') {
					hasX = true;
					break;
				}
				hasX = false;
			}
		}
		if(hasX == false) {
			result = "dy/dx=0";
		}
		return result;
		
	}

    public String deriveEquation() {
    	
    	String userInput = equation;
    	//make side lists
    	String sideList[] = new String[2];
    	sideList[0] = "";
    	sideList[1] = "";
    	int equalSign = 0;
    	for(int i = 0;i<userInput.length();i++)
    		if (userInput.charAt(i) == '=')
    			equalSign = 1;
    		else if (equalSign == 0)
    			sideList[0] = sideList[0] + userInput.charAt(i);
    		else
    			sideList[1] = sideList[1] + userInput.charAt(i);
    			
    	//make clause lists		
    	int numClauses = 1;
    	for(int i=0;i<sideList[1].length();i++) {
    		if((sideList[1].charAt(i) == '+') || (sideList[1].charAt(i) == '-')){
    			numClauses++;
    		}
    	}
    			
    	String clauseList[] = new String[numClauses];
    	char opList[] = new char[numClauses - 1];
    	int count = 0;
    	for(int i=0;i<sideList[1].length();i++){
    		if((sideList[1].charAt(i) == '+') || (sideList[1].charAt(i) == '-')){
    			opList[count] = sideList[1].charAt(i);
    			count++;
    		}
    	}
    	for(int i=0;i<clauseList.length;i++){
    		clauseList[i] = "";
    	}
 		int k=0;
 		int j=0;
 		int p=0;
 		char storeCharacter = 'a';
    	while(k<clauseList.length){
    		for(int i = 0;i<(sideList[1].length());i++){
    			
    			if((sideList[1].charAt(i+j) != '+') && (sideList[1].charAt(i+j) != '-')) {
    				storeCharacter = sideList[1].charAt(i+j);
    				clauseList[k] = clauseList[k] + storeCharacter;
    				p++;
    			}
    			
    			else {
    				p++;
    				k++;
    				j = p;
    				break;
    			}
    			if((i+j+1) == sideList[1].length()) {
    				k++;
    				break;
    			}
    		}
    		
    	}   
    	
    	//do calculus
    	String derivative = "";
    	derivative = clauseDerivative(clauseList, opList);
    	return derivative;
    		
    }
    
} 