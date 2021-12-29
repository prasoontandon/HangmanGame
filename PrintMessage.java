import java.util.ArrayList;

public class PrintMessage {
    
    public static void welcome() {
      System.out.println("Welcome to Hang Man! A game created by prasoontandon and raihantanvir");
      
      System.out.println("Rules of the game:\n"
          + "1. You have 8 incorrect guesses.\n"
          + "2. Each incorrect guess gets your man one step closer to being hung.\n"
          + "3. Wrong guesses are displayed below the blanks you have to guess.\n"
          + "4. Only the first letter is counted.\n"
          + "5. Have fun!");     
      System.out.println("*********************************************************************\n");
      
      ////////////////////////////////////////////////////////////////////////////////////////////
      ////////////////////////////////////////////////////////////////////////////////////////////
      
    }
  
    public static void hangMan(int numOfTries, int NUM_OF_ATTEMPTS, char[] gameArray, ArrayList<Character> userGuessesList) {
       
       System.out.println("Game Status:\n"
           + "******************************************************\n"
           + "Number of guesses remaining: " + (NUM_OF_ATTEMPTS - numOfTries) + "\n");
       
           
           if(numOfTries >= 1) {
               System.out.println("  ('_')");             
           }
           
           if(numOfTries >= 2) {
               System.out.print(  " >--|");             
           }
           
           if(numOfTries >= 3) {
               System.out.println(       "--<");             
           }
           
           if(numOfTries >= 4) {
               System.out.print(  "    |     \n" +
                                  "  ==");             
           }
                     
           if(numOfTries >= 5) {
               System.out.println(     " ==");             
           }
           
           System.out.println();
           PrintMessage.userGuesses(gameArray, userGuessesList);
          
           
           
    }
    
    private static void userGuesses(char[] gameArray, ArrayList<Character> userGuessesList) {
                
        for (int j = 0; j < gameArray.length; ++j) {
            System.out.print(gameArray[j] + " ");
        }
        
        
        System.out.print("\nYour guesses so far: ");
        for (int i = 0; i < userGuessesList.size(); ++i) {
            System.out.print(userGuessesList.get(i) + " ");
        }
        System.out.println();
       
        
    }

    
}
