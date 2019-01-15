import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		Scanner input = new Scanner(System.in);

		System.out.println("Bästa lagen i...?");
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
			System.out.println("Du valde " + genre + "! Här är några lag!");
			System.out.println();
			System.out.println("1. Chelsea");
			System.out.println("2. Tottenham");
			System.out.println("3. Manchester city");
			System.out.println();
			break;
		case 2:
			genre = "Spanien";
			System.out.println("Du valde " + genre + "! Här är några lag!");
			System.out.println();
			System.out.println("1. Barcelona");
			System.out.println("2. Atletico Madrid");
			System.out.println("3. Real Madrid");
			System.out.println();
			break;
		case 3:
			genre = "Tyskland";
			System.out.println("Du valde " + genre + "! Här är några lag!");
			System.out.println();
			System.out.println("1. Bayern");
			System.out.println("2. RB Leipzig");
			System.out.println("3. Dortmund");
			System.out.println();
			break;
		case 4:
			genre = "Italien";
			System.out.println("Du valde " + genre + "! Här är några lag!");
			System.out.println();
			System.out.println("1. Juventus");
			System.out.println("2. Napoli");
			System.out.println("3. Roma");
			System.out.println();
			break;
		case 5:
			genre = "Sverige";
			System.out.println("Du valde " + genre + "! Här är några lag!");
			System.out.println();
			System.out.println("1. Änglana");
			System.out.println("2. Malmö FF");
			System.out.println("3. AIK");
			System.out.println();
			break;
		default:
			genre = "felaktigt";
			System.out.println("Du gjorde ett " + genre + " val! Försök ingen!");
			System.out.println();
			break;
		}

		input.close();
	}

}