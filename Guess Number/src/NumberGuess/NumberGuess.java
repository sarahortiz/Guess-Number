package NumberGuess;
import java.util.Scanner;
public class NumberGuess
	{
		static int randomNumber;
		static int counter;
	
	public static void main(String[]args)
		{
		 greetPlayer();
		 generateRandomNumber();
		 evaluateGuess();
			}
			public static void evaluateGuess()
			{
			boolean correctGuess=false;
			while(correctGuess==false)
				{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your guess?");
				int guess = userInput.nextInt();
				if (guess > randomNumber)
					{
					System.out.println("The number that you have chosen is greater than the correct number");
					}
				else if (guess < randomNumber)
					{
					System.out.println("The number that you have chosen is less than the correct number.");
					}
				else if (guess == randomNumber)
					{
					correctGuess = true;
					System.out.println("Congratulations! The number that you have chosen is correct! :D");
					}
					counter =  counter + 1;
					}
				if (counter > 1)
					{
					System.out.println("It took you "  + counter +  " tries!");
					}
				if (counter == 1)
					{
					System.out.println("It took you 1 try!");
					}
				}	
		public static void greetPlayer() 
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name =  userInput.nextLine();
				System.out.println("Hello, " + name + "! You look lovely today!"  + "Choose a number between 1 and 10.");
			}
		public static int generateRandomNumber()

			{
				 randomNumber = (int) (Math.random()*10)+1;
				 counter = 0;
				return randomNumber;
			}
		}
	