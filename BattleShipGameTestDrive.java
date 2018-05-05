public class BattleShipGameTestDrive{
	public static void main(String[] args){
		BattleShipGame shipTest = new BattleShipGame();
		String[] locationOne = {"1A","1B","1C"};
		String userGuess = "1A";
		String testResult;

		shipTest.setLocation(locationOne);
		testResult = shipTest.checkLocation(userGuess);

		if( testResult == "hit"){
	//	if(gameOne.checkLocation(userGuess).equals("hit"){
			System.out.println("passed.");
		}
		else{
			System.out.println("failed.");
		}	
	}
}