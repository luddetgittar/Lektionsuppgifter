import java.util.Scanner;

public class läxauppg3{

public static void main(String[] args) {
		
		int tal = 1;
		int nyttal = 0;
		int count = 0;
		boolean exit = false;
		
		System.out.println("skriv tal");
		
		Scanner input = new Scanner(System.in);
		
		while(!exit) {
			nyttal = input.nextInt();
			tal = tal * nyttal;
			count++;
			System.out.println(tal);
			if (tal >= 100000 || count == 10) {
				System.out.println(tal);
				exit = true;
			}
		}
	}

}