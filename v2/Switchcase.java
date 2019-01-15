import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {

		// Switch - case �r anv�ndbart n�r man har ett best�mt antal fall som kan h�nda,
		// t ex en meny f�r anv�ndare

		Scanner input = new Scanner(System.in);

		System.out.println("B�sta lagen i...?");
		System.out.println("(1) - England");
		System.out.println("(2) - Spanien");
		System.out.println("(3) - Tyskland");
		System.out.println("(4) - Italien");
		System.out.println("(5) - Sverie");
		System.out.println();

		int choice = input.nextInt();

		String genre;

		switch (choice) {
		case 1:
			genre = "England";
			System.out.println("Du valde " + genre + "! H�r �r n�gra lag!");
			System.out.println();
			System.out.println("1. Chelsea");
			System.out.println("2. Tottenham");
			System.out.println("3. Manchester city");
			System.out.println();
			break;
		case 2:
			genre = "Spanien";
			System.out.println("Du valde " + genre + "! H�r �r n�gra lag!");
			System.out.println();
			System.out.println("1. Barcelona");
			System.out.println("2. Atletico Madrid");
			System.out.println("3. Real Madrid");
			System.out.println();
			break;
		case 3:
			genre = "Tyskland";
			System.out.println("Du valde " + genre + "! H�r �r n�gra lag!");
			System.out.println();
			System.out.println("1. Bayern");
			System.out.println("2. RB Leipzig");
			System.out.println("3. Dortmund");
			System.out.println();
			break;
		case 4:
			genre = "Italien";
			System.out.println("Du valde " + genre + "! H�r �r n�gra lag!");
			System.out.println();
			System.out.println("1. Juventus");
			System.out.println("2. Napoli");
			System.out.println("3. Roma");
			System.out.println();
			break;
		case 5:
			genre = "Sverige";
			System.out.println("Du valde " + genre + "! H�r �r n�gra lag!");
			System.out.println();
			System.out.println("1. �nglana");
			System.out.println("2. Malm� FF");
			System.out.println("3. AIK");
			System.out.println();
			break;
		default:
			genre = "felaktigt";
			System.out.println("Du gjorde ett " + genre + " val! F�rs�k ingen!");
			System.out.println();
			break;
		}

		input.close();
	}

}