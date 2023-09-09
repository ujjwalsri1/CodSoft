import java.util.Scanner;

public class Guess {

	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100
							* Math.random());

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100.");

		while(true) {

			System.out.println(
				"Guess the number:");

			guess = sc.nextInt();

			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		
	}

	public static void
	main(String arg[])
	{

		guessingNumberGame();
	}
}
