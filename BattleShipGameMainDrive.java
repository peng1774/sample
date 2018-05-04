// import java.util.Scanner;
import java.util.Arrays;

public class BattleShipGameMainDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		boolean isAlive = true;
		int locationStart = (int)(Math.random()*4);
		int[] locationArray = {locationStart, locationStart+1, locationStart+2};
		String[] locationArrayString = new String[locationArray.length];
		for(int i = 0; i < locationArray.length; i++){
			locationArrayString[i] = String.valueOf(locationArray[i]);
		}
		GameHelper helper = new GameHelper();

		System.out.println(Arrays.toString(locationArrayString));

		String result;
		String userGuess;
		//Scanner scan = new Scanner(System.in); // read user input
		BattleShipGame gameOne = new BattleShipGame();

		gameOne.setLocation(locationArrayString);

		while(isAlive){
			//String userGuess = console.readLine("Enter input:");
			// userGuess = scan.next();
			userGuess = helper.getUserInput("enter a number: ");
			result = gameOne.checkLocation(userGuess);
			numOfGuesses+=1;
			if(result.equals("kill")){
				isAlive = false;
			}
			System.out.println(result);
		}
		System.out.println("you took " + Integer.toString(numOfGuesses) + " guesses");
	}
}