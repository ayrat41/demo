import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class walmartTrack {
	static int inputDirection;
	static String [] direction = {"><",">,v,<,v",">,>,>,>,>,>,>,<,<,<,<,<,<,<"};
	static int where;

	public static void main(String[] args) {
			int where = walmartTrack.inputDirection()-1;
			if (where==0 || where==1 || where==2){
				walmartTrack.calcStores(direction[where]);
					} else {
			System.out.println("Sorry it's wrong direction");
				}
	}
	
	public static int inputDirection() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose one of the folowing directions: 1 >;");
		System.out.println("Choose one of the folowing directions: 2 >,v,<,v;");
		System.out.println("Choose one of the folowing directions: 3 >,>,>,>,>,>,>,<,<,<,<,<,<,<");
		inputDirection = scanner.nextInt();
		scanner.close();
		return inputDirection;
	}

	public static void calcStores(String direction) {
		
		String[] directionSplit = direction.split(",");
		Set <String> unicDirection = new HashSet<String>();
		int k = 0;
		int v = 0;
		Map <Integer, Integer> storeCheck = new HashMap<>();
		storeCheck.put(k, v);
		for (int i = 0; i < directionSplit.length; i++) {	
		if (directionSplit[i].contains(">")) {
			k=k+1;
		} else if (directionSplit[i].contains("<")) {
			k=k-1;
		} else if (directionSplit[i].contains("^")) {
			v=v+1;
		} else if (directionSplit[i].contains("v")) {
			v=v-1;
		}
		storeCheck.put(k, v);
		unicDirection.add(storeCheck.toString());
		}
		
		System.out.println(unicDirection.size());
	
	}
}
