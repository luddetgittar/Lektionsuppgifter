import java.util.Scanner;
public class Volume {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("vad är radien?");
		double radius=input.nextDouble();
		System.out.println(volume(radius));
}
	public static double volume(double radius) {
		radius = (Math.pow(radius, 3) * 4 * Math.PI) / 3;
		return radius;
	}
}
	
