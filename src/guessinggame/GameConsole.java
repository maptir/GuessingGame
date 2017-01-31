package guessinggame;

import java.util.Scanner;

/**
 * Console of guessing game.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class GameConsole {
	Scanner s = new Scanner(System.in);

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param Game
	 *            object that input from user.
	 * 
	 * @return Secret number that player should guess.
	 */
	public int play(GuessingGame game) {
		System.out.println("Guessing Game");
		System.out.println(game.getHint());
		boolean guess = true;
		int guessNumber = 0;
		while (guess) {
			System.out.print("Your guess ? ");
			guessNumber = s.nextInt();
			if (game.guess(guessNumber)) {
				guess = false;
			}
			System.out.println(game.getHint());
		}
		return guessNumber;
	}
}
