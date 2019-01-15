import java.util.Scanner;
public class läxauppg2 {
public static void main(String[] args) {
		
		String mening = "";
		String nymening = "";
		boolean exit = false;
		
		System.out.println("skriv en mening");
		
		Scanner input = new Scanner(System.in);
		
		while(!exit) {
			nymening = input.next();
			mening = nymening;
			if (mening.equals("exit")) {
				
				exit = true;
			}
		}
	}

}