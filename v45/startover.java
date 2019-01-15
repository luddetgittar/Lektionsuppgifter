import java.util.Scanner;

public class startover {

public static void main(String[] args) {

	int heltal = 1;
	double decimaltal = 1.5;
	String ord = "hej";
	char tecken = 'h';
	double average = 0;
	int tal1 =0;
	
	System.out.println("Skriv tio nummer!");
	Scanner input = new Scanner(System.in);
	
	
	for (int i = 1; i <= 10; i++) {
		tal1 += input.nextInt();
		
	}
	average = (double) tal1/10;
	System.out.println(tal1);
	System.out.println(average);
}

}
