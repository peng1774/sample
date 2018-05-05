// import java.util.Scanner;
import java.util.Arrays;

public class BattleShipGameMainDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		boolean isAlive = true;
		GameHelper helper = new GameHelper();
		String result;
		String userGuess;
		//Scanner scan = new Scanner(System.in); // read user input

		BattleShipGame ship1 = new BattleShipGame();
		BattleShipGame ship2 = new BattleShipGame();
		BattleShipGame ship3 = new BattleShipGame();

		ship1.setName("ship1");
		ship2.setName("ship2");
		ship3.setName("ship3");

		String[] loc1 = {"1A","1B","1C"}; 
		String[] loc2 = {"3A","4A","5A"}; 
		String[] loc3 = {"5G","6G","7G"}; 

		ship1.setLocation(loc1);
		ship2.setLocation(loc2);
		ship3.setLocation(loc3);

		while(isAlive){
			userGuess = helper.getUserInput("enter a grid location: ");
			if(!ship1.checkKilled()){
				System.out.println("ship1:");
				result = ship1.checkLocation(userGuess);	 
			}
			if(!ship2.checkKilled()){
			System.out.println("ship2:");
				result = ship2.checkLocation(userGuess);	 
			}
			if(!ship3.checkKilled()){
			System.out.println("ship3:");
				result = ship3.checkLocation(userGuess);	 
			}
			if(ship1.checkKilled() && ship2.checkKilled() && ship3.checkKilled() ){
				isAlive = false;
			}
			numOfGuesses++;
		}
		System.out.println("you took " + Integer.toString(numOfGuesses) + " guesses");



		// =======================
		// while(isAlive){
		// 	//String userGuess = console.readLine("Enter input:");
		// 	// userGuess = scan.next();
		// 	userGuess = helper.getUserInput("enter a number: ");
		// 	result = gameOne.checkLocation(userGuess);
		// 	numOfGuesses+=1;
		// 	if(result.equals("kill")){
		// 		isAlive = false;
		// 	}
		// 	System.out.println(result);
		// }
		// System.out.println("you took " + Integer.toString(numOfGuesses) + " guesses");
	}
}