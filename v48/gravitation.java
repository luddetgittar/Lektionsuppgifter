
public class gravitation {

	public static void main(String[] args) {
	double massap=72;
	double G  = 6.67408 * Math.pow(10, -11);
	double massaj = 5.972 * Math.pow(10, 24);
	double radiej = 6378000;
	
	System.out.println("The force is " + gravitationskraft( massap, G, massaj, radiej));
	
	
	}		
static double gravitationskraft(double massap, double G, double massaj, double radiej) {

double force;
force = massap * massaj * G / (Math.pow(radiej, 2));
return force;
}

}

