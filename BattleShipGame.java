import java.util.Arrays;
import java.util.ArrayList;

public class BattleShipGame{
	private ArrayList<String> locationThree = new ArrayList<String>();
	private String userGuess;
	private int count = 0;
	private String result = "miss";
	
	private String shipName;
	private boolean isKilled = false;

	void setName(String _name){
		shipName = _name;
	}

	boolean checkKilled(){
		return isKilled;
	}

	void setLocation(String[] inputLocationThree){
		for(String i : inputLocationThree){
			locationThree.add(i);
		}
		System.out.println(locationThree);
	}

	String checkLocation(String userGuess){
		result = "miss";
		if(locationThree.contains(userGuess)){
			int idx = locationThree.indexOf(userGuess);
			locationThree.remove(idx);
			result = "hit";
		}
		if(locationThree.isEmpty()){
			System.out.println("killed : " + shipName);
			result = "kill";
			isKilled = true;
		}
		System.out.println(result);
		return result;
		
	}
}