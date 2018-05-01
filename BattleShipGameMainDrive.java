import java.util.Scanner;

public class BattleShipGameMainDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		boolean isAlive = true;
		int locationStart = (int)(Math.random()*4);
		int[] locationArray = {locationStart, locationStart+1, locationStart+2};
		String result;
		String userGuess;
		Scanner scan = new Scanner(System.in); // read user input
		BattleShipGame gameOne = new BattleShipGame();

		gameOne.setLocation(locationArray);

		while(isAlive){
			//String userGuess = console.readLine("Enter input:");
			System.out.println("Entera number: ");
			userGuess = scan.next();
			result = gameOne.checkLocation(userGuess);
			numOfGuesses+=1;
			if(result.equals("kill")){
				isAlive = false;
			}
			//System.out.println(result);
		}
		System.out.println("you took " + Integer.toString(numOfGuesses) + " guesses");
	}
}