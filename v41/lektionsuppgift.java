import java.util.Scanner;
public class lektionsuppgift {
			public static void main(String[] args) {
				
				lol();
				
				int x = 3;
				System.out.println(min(x, 4));
				
				ageControl(20);
				
				
			}
			public static void lol() {
				System.out.println("hahahaha");
			}
			public static int min(int a, int b) {
				if (a>b) {
					return b;
				}
				else {
					return a;
				}
				
			}
			public static int ageControl(int age) {
				if (age<6) {
					System.out.println("Sm�barn f�r inte g�ra n�got.");
				}
				if
				(age<13 && age>5)
				{System.out.println("Du f�r spela fornite.");
				}
				
				if(age<15 && age>12)
				{System.out.println("Du �r ton�ring.");
				}
				
				if
				(age<18 && age>14) 
				{System.out.println("Du f�r k�ra moppe.");
				}
				
				if(age<20 && age>17)
				{System.out.println("Du f�r k�ra bil.");
				}
				
				if(age<65 && age>19) 
				{System.out.println("Du f�r g� p� systemet.");
				}

				if(age<100 && age>64) 
				{System.out.println("Du �r pension�r.");
				}

				if(age>100) 
				{System.out.println("R.I.P");
				}
				return age;
				
			}
			
}



