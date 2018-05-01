public class BattleShipGameTestDrive{
	public static void main(String[] args){
		BattleShipGame gameOne = new BattleShipGame();
		int[] locationOne = {1,2,3};
		String userGuess = "1";
		String testResult;

		gameOne.setLocation(locationOne);
		testResult = gameOne.checkLocation(userGuess);

		if( testResult == "hit"){
	//	if(gameOne.checkLocation(userGuess).equals("hit"){
			System.out.println("passed.");
		}
		else{
			System.out.println("failed.");
		}	
	}
}