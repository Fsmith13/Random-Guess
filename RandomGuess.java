// Filename: RandomGuess.java
// Guessing Game version 1
// Author: Frank
// date: 1/17/19

import javax.swing.JOptionPane;

public class RandomGuess
{
	public static void main(String[] args)
	{
		int guess;
		int result;
		String message;
		int attempts = 1;
		final int MIN = 1;
		final int MAX = 10;

		// Game mechanics begin
		result = MIN + (int)(Math.random() * MAX);

		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please think of a number between " + MIN + " and " + MAX));
		
		// Enter a while loop and then execute the Decision making game mechanics
		while(result != guess)
		{
			if(guess < result)
			{
				message = "Sorry, your guess was too low!";
			}
			else
			{
				message = "Sorry, your guess was too high!";
			}
			// Guess was evaluated, show the user the result, ask them to play again
			guess = Integer.parseInt(JOptionPane.showInputDialog(null, message + "Try again! \nPlease think of a number between " + MIN + " and " + MAX));
			attempts++;
		}

		JOptionPane.showMessageDialog(null, "Congratulations! You hava a match. It only took you " + attempts + " tries to get a match.");
	}
}