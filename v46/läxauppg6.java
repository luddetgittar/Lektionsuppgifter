import java.util.Scanner;

public class läxauppg6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hur många x vill du ha i basen");
		int bas = sc.nextInt();
		int spa = bas;
		for(int i = 0; i < bas; i++) {
			for(int e = 0; e < spa; e++){
				System.out.print(" ");
			}
			for(int y=0; y <= i; y++) {
				System.out.print("x ");
			}
			spa--;
			System.out.println();
		}
		
	}
}
