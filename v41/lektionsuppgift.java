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
					System.out.println("Småbarn får inte göra något.");
				}
				if
				(age<13 && age>5)
				{System.out.println("Du får spela fornite.");
				}
				
				if(age<15 && age>12)
				{System.out.println("Du är tonåring.");
				}
				
				if
				(age<18 && age>14) 
				{System.out.println("Du får köra moppe.");
				}
				
				if(age<20 && age>17)
				{System.out.println("Du får köra bil.");
				}
				
				if(age<65 && age>19) 
				{System.out.println("Du får gå på systemet.");
				}

				if(age<100 && age>64) 
				{System.out.println("Du är pensionär.");
				}

				if(age>100) 
				{System.out.println("R.I.P");
				}
				return age;
				
			}
			
}



