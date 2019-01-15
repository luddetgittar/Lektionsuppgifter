
public class läxauppg4 {
	public static void main(String[] args) {
		
		
		int nyttal=0;
		int summa=0;
		boolean exit = false;
		
		while(!exit) {
		if(nyttal %7 == 0) {
			summa = nyttal + summa;
			
		}
		nyttal ++;
		if(nyttal >= 10000) {
			exit = true;
			System.out.println(summa);
		}
		}
	}
	
	}
