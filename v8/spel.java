import java.util.Scanner;
public class spel{

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);	
		int hemligttal;
		boolean exit = false;
		int count=0;
		hemligttal = (int) (Math.random() * 1000) + 1;
		System.out.println("Gissa talet i mellan 1-1000");
		while(!exit) {
			count ++;
			int Gissning;	
			Gissning = input.nextInt();
			if(Gissning== hemligttal) {
				System.out.println("Grattis det tog dig " + count + " att gissa ett tal din looser!!!");	
				exit = false;
			}else if(Gissning < hemligttal) {
				System.out.println("HAHA MISS, Testa lite mer n�sta g�ng din fjolla");
			}else if(Gissning > hemligttal) {
				System.out.println("Det var n�stan n�ra, Det �r ju uppenbarat att det r�tta svaret �r mindre");
			}
			}
		}
		
	}



