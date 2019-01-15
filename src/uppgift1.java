import java.util.Scanner;
public class uppgift1 {

	public static void main(String[] args) {
		
		boolean exit=false;
		Scanner input=new Scanner(System.in);
		do {
		System.out.println("skriv ett tal?");
		int tal1 =input.nextInt();

		System.out.println("skriv ett till tal?");
		int tal2 =input.nextInt();
		
		if(tal1 > tal2) {
			System.out.print(tal2 + " är minst");
			exit = true;
		}else if (tal2 > tal1)
			System.out.print(tal1 + " är minst");
			exit = true;
		}while (!exit);
		
		
	}

}
