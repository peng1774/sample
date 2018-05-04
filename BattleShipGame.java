import java.util.Arrays;
import java.util.ArrayList;

public class BattleShipGame{
	// private int[] locationThree = new int[3];
	private ArrayList<String> locationThree = new ArrayList<String>();
	private String userGuess;
	private int count = 0;
	private String result = "miss";

	void setLocation(String[] inputLocationThree){
		for(String i : inputLocationThree){
			locationThree.add(i);
		}
	}
	

	String checkLocation(String userGuess){
		result = "miss";
		if(locationThree.contains(userGuess)){
			int idx = locationThree.indexOf(userGuess);
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