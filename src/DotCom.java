public class DotCom {
    int[] locationCells; // int array that holds the locationCells
    int numOfHits; // how many times has the user guessed

    public void setLocationCells(int[] locs) { // we are creating a method setting the locations of cells it doesn't return anything
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) { // create a check for the guess
        int guess = Integer.parseInt(stringGuess); // convert user guess into int
        String result = "miss"; // set the result by default to miss
        for (int cell : locationCells) { // repeat for each cell in the location cell
            if (guess == cell) { // compare to the cell
                result = "hit";
                numOfHits++;
                break; // gets immediatly out of the loop
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;


    }
}
