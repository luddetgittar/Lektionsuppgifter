import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {

		int[] jonny = { 1, 1, 3, 4, 5, 6, 5, 4, 25, 7, 5, 3 };

		for (int i = 0; i < jonny.length; i++) {
			System.out.println(jonny[i]);
		}
		ArrayList<String> NameList = new ArrayList<>();
		NameList.add("Jonas");
		NameList.add("Klas");
		NameList.add("Kalle");
		NameList.add("Mohammed");
		NameList.add("Pelle");

		for (int i = 0; i < NameList.size(); i++) {
			System.out.print(NameList.get(i) + " ");
		}
		NameList.set(2, "sture");
		System.out.println(NameList);
	}
}
