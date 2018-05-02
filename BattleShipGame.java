import java.util.Arrays;
import java.util.ArrayList;

public class BattleShipGame{
	// private int[] locationThree = new int[3];
	private ArrayList<Integer> locationThree = new ArrayList<Integer>();
	private String userGuess;
	private int count = 0;
	private String result = "miss";

	void setLocation(int[] inputLocationThree){
		// locationThree = inputLocationThree;
		// System.out.println(Arrays.toString(locationThree));
		// for(int i = 0; i < inputLocationThree.length(); i++){
		// 	locationThree[i] = inputLocationThree[i];
		for(int i : inputLocationThree){
			locationThree.add(i);
		}
	}
	

	String checkLocation(String userGuess){
		int userGuessInt = Integer.parseInt(userGuess);

		// for(int i = 0; i < locationThree.length; i++){
		// 	if(locationThree[i] == userGuessInt)
		// 		result = "hit";
		// 		count ++;
		// 		if(count == 3){
		// 			result = "kill";
		// 		}
		// 		System.out.println(result);
		// 		return(result);		
		// } 


		// for(int cell : locationThree){
		// 	if(userGuessInt == cell){
		// 		result = "hit";
		// 		count++;
		// 		break;
		// 	}
		// 	result = "miss";
		// }
		// if(count == 3){
		// 	result = "kill";
		// }
		// System.out.println(result);
		// return(result);	


		// //count++;
		// for(int i = 0; i < locationThree.size(); i++){
		// 	if(userGuessInt == locationThree.get(i)){
		// 		locationThree.remove(i);
		// 		result = "hit";
		// 		break;
		// 	}
		// }
		// if(locationThree.isEmpty()){
		// 	System.out.println("kill. game is over.");
		// 	result = "kill";
		// }
		// return(result);	

		result = "miss";
		if(locationThree.contains(userGuessInt)){
			int idx = locationThree.indexOf(userGuessInt);
			locationThree.remove(idx);
			result = "hit";
		}
		if(locationThree.isEmpty()){
			System.out.println("kill. game is over.");
			result = "kill";
		}
		return result;
		
	}
}