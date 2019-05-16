import hangman.HangmanConsoleWindow;
import java.util.concurrent.TimeUnit;

public class hangaGubbe {

	static HangmanConsoleWindow hcw = new HangmanConsoleWindow();
	static int health = 10;
	static String ordet;
	static String word;

	public static void main(String[] args) {
		start();
	}

	public static void start() {
		hcw.println("Be en kompis att skriva det hemliga ordet");
		ordet = hcw.nextString();
		word = "";
		for (int i = 0; i < ordet.length(); i++) {
			word += '-';
		}
		hcw.clear();
		mainspel();
	}

	public static void mainspel() {
		// loopar s� l�nge man har health kvar
		while (health > 0) {
			grafik();
			// tar in en liten bokstav
			char gissning = hcw.nextString().toLowerCase().charAt(0);
			// h�ller koll p� om man gissat r�tt
			boolean correct = false;
			// nya streckade ordet
			String updateWord = "";
			// loopar igenom ordet
			for (int i = 0; i < ordet.length(); i++) {
				// j�mf�r varje bokstav i ordet med den man gissat
				if (ordet.toLowerCase().charAt(i) == gissning) {
					// l�gger till bokstaven man gissat
					updateWord += ordet.charAt(i);
					// markerar att man gissat r�tt
					correct = true;
				} else {
					// Beh�ller bokstaven fr�n det str�ckade ordet
					updateWord += word.charAt(i);
				}
			}
			// s�tter str�ckade ordet till det nya
			word = updateWord;
			// tar bort ett health om man gissat fel
			if (!correct) {
				health--;
			}
			// skriver ut om man har f�rlorat
			if (health == 0) {
				hcw.println("tyv�rr s�tnos, du f�rlorade");
				try {
					TimeUnit.SECONDS.sleep(5); // v�ntar fem sekunder
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				hcw.exit();
				
			}

		}
	}
	
	public static void grafik() {
		hcw.clear();
		// skriver ut ens health
		hcw.println("Du har " + health + " liv kvar");
		// skriver ut det streckade ordet
		hcw.println(word);
		// kollar om man gissat r�tt och avslutar d� loopen
		if (word.equals(ordet)) {
			hcw.println("Grattis du vann!");
			try {
				TimeUnit.SECONDS.sleep(5); // v�ntar fem sekunder
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hcw.exit();
		}
	}

}
