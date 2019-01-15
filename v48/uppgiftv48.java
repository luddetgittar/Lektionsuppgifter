
public class uppgiftv48 
{
	public static void main(String[] args) 
	{
		System.out.println(kelvinToCelcius(50));	
		System.out.println(cm3ToM3(1000));
		System.out.println(greetingsPlusAge(58, 30 , "lars","karl"));
	}
	
	static double kelvinToCelcius(double kelvin) {
		
		kelvin = kelvin - 273.15;
		
		return kelvin;
	}
	static double cm3ToM3(double radius) {
		radius= radius/1000000;
		return radius;
	}
	static int greetingsPlusAge(int age, int age2, String namn1, String namn2) {
		int sum=0 ;
		sum = age + age2;
		System.out.println("välkommen "+ namn1 + " " + namn2);
		return sum;
		
	}
}
