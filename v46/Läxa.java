import java.util.Scanner;

public class Läxa {
	
	public static void main(String[] args) {
		
		int tal = 0;
		int nyttal = 0;
		boolean exit = false;
		
		System.out.println("skriv tal");
		
		Scanner input = new Scanner(System.in);
		
		while(!exit) {
			nyttal = input.nextInt();
			tal = tal + nyttal;
			if (nyttal == 0) {
				System.out.println(tal);
				exit = true;
			}
		}
	}

}
