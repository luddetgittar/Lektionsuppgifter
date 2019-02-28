import java.util.ArrayList; //importerar Arraylist
import java.util.HashMap;//importerar Hachmap
import java.util.Map;//importerar Map
import java.util.Scanner;//importerar Scanner

public class spel {

	static boolean exit = false;// skapar en boolian och sätter den som false
	static Scanner input = new Scanner(System.in); // kallar scanner input
	static int hemligttal; // skapar en int som heter hemligttal
	static String restart;// skapar en string som heter restart
	static int count = 0;// skapar en in som heter count och sätter den till 0
	static String playerName;// skapar en string som heter playerName
	static Map<String, ArrayList<Integer>> leaderboard = new HashMap<String, ArrayList<Integer>>();// Skapar en map som
																									// håller koll på
																									// namnet och antal
																									// försök

	public static void main(String[] args) {

		hemligttal = (int) (Math.random() * 10) + 1;// sätter hemligt tal till det talet som math.ramdon säger

		System.out.println("Skriv ditt namn");// frågar spelarens namn
		playerName = input.next();// sätter playerName till spelarens namn

		if (!leaderboard.containsKey(playerName))// ifall namet inte redan finns i leaderboarden skapar den en ny
			leaderboard.put(playerName, new ArrayList<Integer>());
		System.out.println("Gissa talet i mellan 1-10");// säger till spelaren att gissa talet
		start();// startar metoden start

		while (exit) {
			count = 0; // sätter count till 0
			System.out.println("Skriv restart om du vill köra igen");// säger till spelaren hur man restartar
			restart = input.next();// ger restart en string
			if (restart.equals("restart")) {// om restart är restart kör den koden under
				// samma kod som innan
				hemligttal = (int) (Math.random() * 10) + 1;
				System.out.println("Skriv ditt namn");
				playerName = input.next();
				if (!leaderboard.containsKey(playerName))
					leaderboard.put(playerName, new ArrayList<Integer>());
				System.out.println("Gissa talet i mellan 1-10");
				exit = false;
				start();
			}
		}
	}

	public static void start() {
		while (!exit) {
			int Gissning;// skaper en int som heter Gissning
			Gissning = input.nextInt();// sätter Gissning till spelaren gissning
			count++; // lägger till 1 på varje försök pelaren gör
			if (Gissning == hemligttal) {// skaper en lopp som körs om kraven uppfylls
				System.out.println("Grattis det tog dig " + count + " att gissa ett tal din looser!!!");// grattar
																										// spelaren och
																										// visar antal
																										// försök
				ArrayList<Integer> list = leaderboard.get(playerName); // kopplar namnet och antal försök
				list.add(count); // lägger till count i array listan.

				System.out.println("Score för " + playerName + ":");// säger score och spelarens namn
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));// skriver ut antal försök för namet på spelaren
				}

				exit = true;
			} else if (Gissning < hemligttal) {// om spelaren gissar för litet tal skriver den att man ska gissa mer
				System.out.println("HAHA MISS, Testa lite mer nåsta gång din fjolla");
			} else if (Gissning > hemligttal) {// om spelaren gissar för stort tal skriver den att man ska gissa mindre
				System.out.println("Det var nästan nära, Det är ju uppenbarat att det rätta svaret är mindre");
			}
		}
	}
}
