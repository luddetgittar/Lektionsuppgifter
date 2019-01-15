import java.util.Scanner;
public class metoder2 {

	public static void main(String[] args) {
	
Scanner input= new Scanner(System.in);
String name;

	System.out.println("vad heter du?");
	name = input.nextLine();
	welcomeMessage(name);

	}
static void welcomeMessage(String name){

System.out.println("hej " + name + "! Välkommen hit!");
}
}