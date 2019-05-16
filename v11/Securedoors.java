import java.util.ArrayList;
import java.util.Scanner;

public class Securedoors {
	private ArrayList<String> checkdIn;

	public static void main(String[] args) {
		new Securedoors();
	}

	public Securedoors() {
		dataAnalyzering();
	}

	private void dataAnalyzering() {
		Scanner scan = new Scanner(System.in); // skapar scanner
		checkdIn = new ArrayList<String>(); // skapar arraylist
		int nrLog = Integer.parseInt(scan.nextLine()); // sätter nrLog till valt nummer
		for (int i = 0; i < nrLog; i++) {// loopar som många gånger som "nrLog"
			String[] entry = scan.nextLine().split(" "); // splitter loopen vid mellanrummet alltså efter entry eller
															// exit

			if (entry[0].equals("entry") && checkdIn.contains(entry[1])) {// kollar efter entry och om namnet finnas i
																			// listan
				System.out.println(entry[1] + " entered (ANOMALY)");
			} else if (entry[0].equals("exit") && !checkdIn.contains(entry[1])) {// kollar efter exit och om namnet inte
																					// finns med i listan
				System.out.println(entry[1] + " entered (ANOMALY)");
			} else if (entry[0].equals("entry")) { // kollar efter entry
				checkdIn.add(entry[1]);
				System.out.println(entry[1] + " entered");
			} else if (entry[0].equals("exit")) { // kollar efter exit
				checkdIn.remove(entry[1]);
				System.out.println(entry[1] + " exited");
			}
		}
		scan.close(); // stänger scanner
	}

}