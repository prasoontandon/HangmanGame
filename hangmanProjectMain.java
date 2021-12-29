import java.util.Scanner;
import java.util.ArrayList;


public class hangmanProjectMain {
   
	public static void main(String[] args) {
	    ArrayList<Character> userGuessesList = new ArrayList<>();
	    final int NUM_OF_ATTEMPTS = 5;
	    
	    
	    PrintMessage.welcome();
	
		// word is assigned to variable
		String hangmanWord = hangmanProjectWord.wordGenerator();
		
        char[] gameArray = new char[hangmanWord.length()];
        for (int i = 0; i < gameArray.length; ++i) {
            gameArray[i] = '_';
        }
		
		// test
		//System.out.print("The code somehow properly pulled the word: " + hangmanWord);
		
		
		int numOfTries = 0;		
		while(numOfTries < NUM_OF_ATTEMPTS) {
		    		    
		    boolean getGuess = getValidGuess(userGuessesList);
		    
		    if (getGuess == true) {
		        ++numOfTries;
		        
		        char userGuess = userGuessesList.get(userGuessesList.size() - 1);
		        
		        boolean letterFound = false;		        
		        for(int i = 0; i < hangmanWord.length(); ++i) {
		            if(hangmanWord.charAt(i) == userGuess) {
		                letterFound = true;
		                gameArray[i] = userGuess;		                
		            }
		            
		        }		        
		        if (letterFound == true) {
		            System.out.println("Congrats! You guessed correctly!");
		        
		        } else {
		            System.out.println("Sorry incorrect guess");
		        }
		    
		    } 
		    else {
		        System.out.println("Invalid guess! Only letters allowed");
		    }
		    
		    PrintMessage.hangMan(numOfTries, NUM_OF_ATTEMPTS, gameArray, userGuessesList);
		    
		    
		}
		
	}	
	public static boolean getValidGuess(ArrayList<Character> userGuessesList) {
	    
	    Scanner scnr = new Scanner(System.in);
	    System.out.print("Guess a letter: ");
	    
	    char userGuess = Character.toLowerCase(scnr.next().charAt(0));
	    
	    if(userGuessesList.indexOf(userGuess) == -1 && userGuess >= 'a' && userGuess <= 'z') {
	        userGuessesList.add(userGuess);	        
	        return true;
	        
	    } else {
	        return false;
	    }
	    
	}

}
