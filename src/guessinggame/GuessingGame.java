package guessinggame;

import java.util.Random;

/**
 * Game of guessing a secret number.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class GuessingGame {
	private int upperBound;
	private int secret;
	private int count;
	private String hint;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperBound
	 *            is the max value for the secret number(>1).
	 */
	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.count = 0;
		setHint("I'm thinking of a number between 1 and " + upperBound + ".");
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param Limit
	 *            is the upper limit for random number.
	 * @return A random number between 1 and limit (inclusive).
	 */
	private int getRandomNumber(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	/**
	 * Method that check number that player guess.
	 * 
	 * @param Number
	 *            that player guess.
	 * @return True if number is equal to random number. False if number is not
	 *         equal to random number.
	 */
	public boolean guess(int number) {
		count++;
		if (number == secret) {
			setHint("Correct. The secret is " + number + ". You used " + count + " guesses.");
			return true;
		} else if (number < secret) {
			setHint("Sorry, your guess is too small.");
			return false;
		} else {
			setHint("Sorry, your guess is too large.");
			return false;
		}
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return Hint based on the most recent guess.
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * Set hint from a last guess.
	 * 
	 * @param Hint
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Return count of guess number.
	 * 
	 * @return Count of guess number.
	 */
	public int getCount() {
		return count;
	}
}
