
public class Question2 {

	static int faktoriyel(int fak) {
		if (fak == 0) {
			return 1;
		} else {
			return fak * faktoriyel(fak - 1);
		}

	}

	public static void main(String[] args) {

		int fak = 9;
		int sonuc = faktoriyel(fak);
		System.out.println("Faktoriyel = " + sonuc);
	}
}