import java.util.Random;

public class Main {
    public static void main(String[] args) {
     int numOfGuesses = 0; // set the number of guesses to 0
     GameHelper helper = new GameHelper(); // initialize the gameHelper class which is a helper object
     DotCom dot = new DotCom(); // initialize the dotcom method which is a dot object
     int randomNum = (int) (Math.random() * 5); // generate a random number
     int[] locations = {randomNum,randomNum+1,randomNum+2}; // insert the random numbers in the locations array

     dot.setLocationCells(locations); // set the cell method by using a reference variable and passing the locations parameter
     boolean isAlive = true; // set the inital game to be alive

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess); // check yourself method
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.print("You took" + numOfGuesses + "guesses");
            }
        }
    }
}