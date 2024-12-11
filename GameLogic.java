public class GameLogic {
    private int randomNumber;
    private int chancesLeft;

    // Constructor to initialize game
    public GameLogic() {
        this.randomNumber = (int) (Math.random() * 100) + 1; // Random number between 1 and 100
        this.chancesLeft = 5; // The user gets 5 chances to guess
    }

    // Method to check the user's guess
    public String checkGuess(int userGuess) {
        if (userGuess == randomNumber) {
            return "Correct! You've won!";
        } else if (userGuess < randomNumber) {
            chancesLeft--;
            return "Too Low!";
        } else {
            chancesLeft--;
            return "Too High!";
        }
    }

    // Method to get the number of chances left
    public int getChancesLeft() {
        return chancesLeft;
    }

    // Method to check if the game is over
    public boolean isGameOver() {
        return chancesLeft <= 0;
    }

    // Method to get the random number (for displaying after losing)
    public int getRandomNumber() {
        return randomNumber;
    }
}
