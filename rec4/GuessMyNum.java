
public class GuessMyNum {

	public static void main(String[] args) 
	{
		//get the top value of the range of which the two teams agreed upon
		System.out.print("Enter the top range: ");
		int topRange = IO.readInt();
		
		//get the maximum number of guesses
		System.out.print("Enter the maximum number of guesses: ");
		int guesses = IO.readInt();
		
		//get TeamA's number
		System.out.print("Team A enter your number: ");
		int teamANum = IO.readInt();
		
		//report bad input if TeamA's number is not within the range
		if(teamANum > topRange || teamANum < 1)
		{
			IO.reportBadInput();

			//the line below tells the main function to stop executing thus ending the program
			return;
		}
		
		//generate blank lines so that TeamA's number can't be seen
		for(int i=0; i <100; i++)
		{
			System.out.println();
		}

		//get TeamB's number
		System.out.print("Team B enter your number: ");
		int teamBNum = IO.readInt();

		if(teamBNum > topRange || teamBNum < 1)
		{
			IO.reportBadInput();

			//the line below tells the main function to stop executing thus ending the program
			return;
		}

		//generate blank lines so that TeamB's number can't be seen
		for(int i=0; i <100; i++)
		{
			System.out.println();
		}
		
		//loop as long as the number of guesses does not run out
		for(int i=0; i<guesses; i++)
		{
			System.out.print("Team A enter your guess: ");
			int teamAGuess = IO.readInt();
			
			System.out.print("Team B enter your guess: ");
			int teamBGuess = IO.readInt();
			
			if(teamAGuess==teamBNum)
			{
				IO.outputStringAnswer("Team A wins!");
				
				//break out of the loop with the keyword 'break;' below
				break;
			}
			else
			{
				if(teamAGuess>teamBNum)
				{
					IO.outputStringAnswer("lower");
				}
				else
				{
					IO.outputStringAnswer("higher");
				}
			}
			
			
			if(teamBGuess==teamANum)
			{
				IO.outputStringAnswer("Team B wins!");

				//break out of the loop with the keyword 'break;' below
				break;
			}
			else
			{
				if(teamBGuess>teamANum)
				{
					IO.outputStringAnswer("lower");
				}
				else
				{
					IO.outputStringAnswer("higher");
				}
			}
			
			
		}
		
	}

}
