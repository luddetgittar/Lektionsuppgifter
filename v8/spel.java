import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class spel {

	static boolean exit = false;
	static Scanner input = new Scanner(System.in);
	static int hemligttal;
	static String restart;
	static int count = 0;
	static String playerName;
	static Map<String, ArrayList<Integer>> leaderboard = new HashMap<String, ArrayList<Integer>>();

	public static void main(String[] args) {
		
		hemligttal = (int) (Math.random() * 10) + 1;
		System.out.println("Skriv ditt namn");
		playerName = input.next();
		if(!leaderboard.containsKey(playerName))
			leaderboard.put(playerName, new ArrayList<Integer>());		System.out.println("Gissa talet i mellan 1-10");
		start();
		System.out.println("leaderboard: " + playerName + " " + count);

		while (exit) {			
			restart = input.nextLine();
			if (restart.equals("restart")) {
				
				hemligttal = (int) (Math.random() * 10) + 1;
				System.out.println("Skriv ditt namn");
				playerName = input.next();
				if(!leaderboard.containsKey(playerName))
					leaderboard.put(playerName, new ArrayList<Integer>());
				System.out.println("Gissa talet i mellan 1-10");
				exit = false;
				start();
			}
		}
	}

	public static void start() {
		while (!exit) {
			int Gissning;
			Gissning = input.nextInt();
			count++;
			if (Gissning == hemligttal) {
				System.out.println("Grattis det tog dig " + count + " att gissa ett tal din looser!!!");
				ArrayList<Integer> list = leaderboard.get(playerName);
				list.add(count);
				
				System.out.println(playerName + " leaderboard");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				
				exit = true;
			} else if (Gissning < hemligttal) {
				System.out.println("HAHA MISS, Testa lite mer nåsta gång din fjolla");
			} else if (Gissning > hemligttal) {
				System.out.println("Det var nästan nära, Det är ju uppenbarat att det rätta svaret är mindre");
			}
		}
	}

}
