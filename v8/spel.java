import java.util.ArrayList; //importerar Arraylist
import java.util.HashMap;//importerar Hachmap
import java.util.Map;//importerar Map
import java.util.Scanner;//importerar Scanner

public class spel {

	static boolean exit = false;// skapar en boolian och s�tter den som false
	static Scanner input = new Scanner(System.in); // kallar scanner input
	static int hemligttal; // skapar en int som heter hemligttal
	static String restart;// skapar en string som heter restart
	static int count = 0;// skapar en in som heter count och s�tter den till 0
	static String playerName;// skapar en string som heter playerName
	static Map<String, ArrayList<Integer>> leaderboard = new HashMap<String, ArrayList<Integer>>();// Skapar en map som
																									// h�ller koll p�
																									// namnet och antal
																									// f�rs�k

	public static void main(String[] args) {

		hemligttal = (int) (Math.random() * 10) + 1;// s�tter hemligt tal till det talet som math.ramdon s�ger

		System.out.println("Skriv ditt namn");// fr�gar spelarens namn
		playerName = input.next();// s�tter playerName till spelarens namn

		if (!leaderboard.containsKey(playerName))// ifall namet inte redan finns i leaderboarden skapar den en ny
			leaderboard.put(playerName, new ArrayList<Integer>());
		System.out.println("Gissa talet i mellan 1-10");// s�ger till spelaren att gissa talet
		start();// startar metoden start

		while (exit) {
			count = 0; // s�tter count till 0
			System.out.println("Skriv restart om du vill k�ra igen");// s�ger till spelaren hur man restartar
			restart = input.next();// ger restart en string
			if (restart.equals("restart")) {// om restart �r restart k�r den koden under
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
			Gissning = input.nextInt();// s�tter Gissning till spelaren gissning
			count++; // l�gger till 1 p� varje f�rs�k pelaren g�r
			if (Gissning == hemligttal) {// skaper en lopp som k�rs om kraven uppfylls
				System.out.println("Grattis det tog dig " + count + " att gissa ett tal din looser!!!");// grattar
																										// spelaren och
																										// visar antal
																										// f�rs�k
				ArrayList<Integer> list = leaderboard.get(playerName); // kopplar namnet och antal f�rs�k
				list.add(count); // l�gger till count i array listan.

				System.out.println("Score f�r " + playerName + ":");// s�ger score och spelarens namn
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));// skriver ut antal f�rs�k f�r namet p� spelaren
				}

				exit = true;
			} else if (Gissning < hemligttal) {// om spelaren gissar f�r litet tal skriver den att man ska gissa mer
				System.out.println("HAHA MISS, Testa lite mer n�sta g�ng din fjolla");
			} else if (Gissning > hemligttal) {// om spelaren gissar f�r stort tal skriver den att man ska gissa mindre
				System.out.println("Det var n�stan n�ra, Det �r ju uppenbarat att det r�tta svaret �r mindre");
			}
		}
	}
}
